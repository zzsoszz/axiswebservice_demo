package dinamica.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;


public class HttpHelperJDK {

	
	public static String sendXML2(String url, String data) throws Exception {
		HttpURLConnection conn = null;
		String content = "";

		URL getUrl = new URL(url);
		conn = (HttpURLConnection) getUrl.openConnection();
		
		conn.setDoOutput(true);
		conn.setDoInput(true);
		conn.setRequestMethod("POST");
		conn.setUseCaches(false);
		conn.setConnectTimeout(60000);
		conn.setInstanceFollowRedirects(true);
		conn.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
		byte[] bdata = data.getBytes("utf-8");
		conn.setRequestProperty("Content-Length", String.valueOf(bdata.length));
		conn.connect();
		DataOutputStream out = new DataOutputStream(conn.getOutputStream());
		out.write(bdata);
		out.flush();
		out.close();

		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
		String inputLine;

		while ((inputLine = reader.readLine()) != null) {
			content += inputLine;
		}
		
		reader.close();
		conn.disconnect();

		return content;
	}
	
	public static String sendXML2(String url) throws Exception {
		HttpURLConnection conn = null;
		String content = "";

		URL getUrl = new URL(url);

		BufferedReader reader = new BufferedReader(new InputStreamReader(getUrl.openStream(),"utf-8"));
		String inputLine;

		while ((inputLine = reader.readLine()) != null) {
			content += inputLine;
		}
		
		reader.close();

		return content;
	}
	
	public static boolean sendxml(String path, String xml) throws Exception {
		byte[] data = xml.getBytes();
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setConnectTimeout(5 * 1000);

		conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
		conn.setRequestProperty("Content-Length", String.valueOf(data.length));
		OutputStream outStream = conn.getOutputStream();
		outStream.write(data);
		outStream.flush();
		outStream.close();
		if (conn.getResponseCode() == 200) {
			return true;
		}
		return false;
	}

	public static boolean sendGetRequest(String path,
			Map<String, String> params, String enc) throws Exception {
		StringBuilder sb = new StringBuilder(path);
		sb.append('?');
		for (Map.Entry<String, String> entry : params.entrySet()) {
			sb.append(entry.getKey()).append('=')
					.append(URLEncoder.encode(entry.getValue(), enc))
					.append('&');
		}
		sb.deleteCharAt(sb.length() - 1);
		URL url = new URL(sb.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setConnectTimeout(5 * 1000);
		if (conn.getResponseCode() == 200) {
			return true;
		}
		return false;
	}

	public static boolean sendPostRequest(String path,
			Map<String, String> params, String enc) throws Exception {
		StringBuilder sb = new StringBuilder();
		if (params != null && !params.isEmpty()) {
			for (Map.Entry<String, String> entry : params.entrySet()) {
				sb.append(entry.getKey()).append('=')
						.append(URLEncoder.encode(entry.getValue(), enc))
						.append('&');
			}
			sb.deleteCharAt(sb.length() - 1);
		}
		byte[] entitydata = sb.toString().getBytes();
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setConnectTimeout(5 * 1000);
		conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		conn.setRequestProperty("Content-Length",
				String.valueOf(entitydata.length));
		OutputStream outStream = conn.getOutputStream();
		outStream.write(entitydata);
		outStream.flush();
		outStream.close();
		if (conn.getResponseCode() == 200) {
			return true;
		}
		return false;
	}

	public static boolean sendPostRequestForTest(String path,
			Map<String, String> params, String enc, String test)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		if (params != null && !params.isEmpty()) {
			for (Map.Entry<String, String> entry : params.entrySet()) {
				sb.append(entry.getKey()).append('=')
						.append(URLEncoder.encode(entry.getValue(), enc))
						.append('&');
			}
			sb.deleteCharAt(sb.length() - 1);
		}
		byte[] entitydata = sb.toString().getBytes();
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setConnectTimeout(5 * 1000);
		conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
		conn.setRequestProperty("Content-Length",
				String.valueOf(entitydata.length));
		conn.setRequestProperty("Appstore-IMSI", test);
		OutputStream outStream = conn.getOutputStream();

		outStream.write(entitydata);
		outStream.flush();
		outStream.close();
		if (conn.getResponseCode() == 200) {
			return true;
		}
		return false;
	}

	public static int checkUrl(String url, int timeout) {
		try {
			URL url2 = null;
			HttpURLConnection conn = null;
			url2 = new URL(url);
			conn = (HttpURLConnection) url2.openConnection();
			long len = conn.getContentLength();
			conn.setConnectTimeout(timeout);
			return conn.getResponseCode();
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}
//
//	private static String getWebSource(String basePath) {
//		String inputLine = "";
//		String read = "";
//		String ip = "";
//		try {
//			URL url = new URL(basePath);
//			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//			BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//			while ((read = in.readLine()) != null) {
//				inputLine += read;
//			}
//			//System.out.println(inputLine);
//			String[] strs = inputLine.split(":");
//			ip = strs[1].split("<")[0];
//			return ip.trim();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return ip;
//	}
//
//	public static String getCity() {
//		String basePath = "http://www.ip138.com/ips.asp";
//		String source = getWebSource(basePath);
//		if (source != null) {
//			source = source.substring(source.indexOf("来自"),
//					source.indexOf("<br/>"));
//		}
//		return source;
//	}
//
//	public static String getIP() {
//		String basePath = "http://www.ip138.com/ip2city.asp";
//		String source = getWebSource(basePath);
//		//System.out.println(source);
//		if (source != null) {
//			source = source.substring(source.indexOf("[") + 1,
//					source.indexOf("]"));
//		}
//		return source;
//	}
//	
	public static String getPublicIP2() throws Exception {
		String inputLine = "";
		String read = "";
		String ip = "";
		URL url = new URL("http://checkip.dyndns.org/");
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		while ((read = in.readLine()) != null) {
			inputLine += read;
		}
		// //System.out.println(inputLine);
		String[] strs = inputLine.split(":");
		ip = strs[1].split("<")[0];
		return ip.trim();
	}

	
	public static String ip;
	public static long lasttime;
	public static String getPublicIP() throws Exception
	{
		long nowtime=System.currentTimeMillis();
		if(ip==null && (nowtime-lasttime)>(1000*60*60*5) )
		{
			lasttime=nowtime;
			//ip=getPublicIP138();
		}
		return ip;
	}
	
	
	
//	public static String getPublicIP138() throws Exception  {
//			try {
//				  URL url = new URL("http://iframe.ip138.com/ic.asp");
//				  URLConnection conn = url.openConnection();
//				  conn.setConnectTimeout(60000);
//				  conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.2.15) Gecko/20110303 Firefox/3.6.15");
//				  conn.setRequestProperty("Content-Type", "text/html");
//				  conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
//				  InputStream is = conn.getInputStream();
//				  BufferedReader br = new BufferedReader(new InputStreamReader(is, "GB2312"));
//				  String line = null;
//				  while ((line = br.readLine()) != null) {
//					   //System.out.print(line);
//					   String res=StringHelper.match(line,"(\\d+\\.\\d+\\.\\d+\\.\\d+)");
//					   if(res!=null)
//					   {
//						   return res;
//					   }
//				  }
//				  br.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			//使用第二种方式
//			return getPublicIP2();
//	}
//	
	
	
	
	
	public static void main(String[] args) throws Exception {
		//System.out.println(HttpHelperJDK.getPublicIP());
	}

	public static int checkUrl(String url) {
		return checkUrl(url, 2000);
	}

}
