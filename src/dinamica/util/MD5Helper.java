package dinamica.util;

import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;


public class MD5Helper {
	
	
	public static String md5bybit(String plainText,int bit) throws UnsupportedEncodingException {
		String result = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes("UTF-8"));
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			// result = buf.toString(); //md5 32bit
			// result = buf.toString().substring(8, 24))); //md5 16bit
			if(bit==16)
			{
				result = buf.toString().substring(8, 24);
				////System.out.println("mdt 16bit: " + buf.toString().substring(8, 24));
			}else{
				//32位
				result = buf.toString();
				////System.out.println("md5 32bit: " + buf.toString());
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}
	public static String md5bybit(String plainText) {
		try {
			return md5bybit(plainText,16);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	* md5加密方法
	* @author: zhengsunlei
	* Jul 30, 2010 4:38:28 PM
	* @param plainText 加密字符串
	* @return String 返回32位md5加密字符串(16位加密取substring(8,24))
	* 每位工程师都有保持代码优雅的义务
	* each engineer has a duty to keep the code elegant
	*/
	public final static String md5test(String plainText) {
		// 返回字符串
		String md5Str = null;
		try {
			// 操作字符串
			StringBuffer buf = new StringBuffer();
			/**
			 * MessageDigest 类为应用程序提供信息摘要算法的功能，如 MD5 或 SHA 算法。
			 * 信息摘要是安全的单向哈希函数，它接收任意大小的数据，并输出固定长度的哈希值。
			 * 
			 * MessageDigest 对象开始被初始化。 该对象通过使用 update()方法处理数据。 任何时候都可以调用
			 * reset()方法重置摘要。 一旦所有需要更新的数据都已经被更新了，应该调用digest()方法之一完成哈希计算。
			 * 
			 * 对于给定数量的更新数据，digest 方法只能被调用一次。 在调用 digest 之后，MessageDigest
			 * 对象被重新设置成其初始状态。
			 */
			MessageDigest md = MessageDigest.getInstance("MD5");

			// 添加要进行计算摘要的信息,使用 plainText 的 byte 数组更新摘要。
			md.update(plainText.getBytes());

			// 计算出摘要,完成哈希计算。
			byte b[] = md.digest();
			int i;

			for (int offset = 0; offset < b.length; offset++) {

				i = b[offset];

				if (i < 0) {
					i += 256;
				}
				if (i < 16) {
					buf.append("0");
				}
				// 将整型 十进制 i 转换为16位，用十六进制参数表示的无符号整数值的字符串表示形式。
				buf.append(Integer.toHexString(i));
			}
			// 32位的加密
			md5Str = buf.toString();
			// 16位的加密
			// md5Str = buf.toString().md5Strstring(8,24);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return md5Str;
	}

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		System.out.println(MD5Helper.md5bybit("123456",32));
	}
	//e10adc3949ba59abbe56e057f20f883e
	//e10adc3949ba59abbe56e057f20f883e
}

//81dc9bdb52d04dc20036dbd8313ed055