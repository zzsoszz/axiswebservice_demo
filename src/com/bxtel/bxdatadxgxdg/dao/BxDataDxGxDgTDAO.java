package com.bxtel.bxdatadxgxdg.dao;


import com.bxtel.bxdatadxgxdg.*;

import com.bxtel.bxdatadxgxdg.model.*;
import dinamica.*;
import dinamica.*;
import dinamica.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.sql.DataSource;
import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import oracle.sql.ROWID;



@Repository("BxDataDxGxDgTDAO")
public class BxDataDxGxDgTDAO
{

	@Resource
	public JdbcTemplate jdbcTemplate;

	@Resource
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private static final Log logger = LogFactory.getLog(BxDataDxGxDgTDAO.class);
	
	//@TriggersRemove(cacheName = "BxDataDxGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public BxDataDxGxDgT add(BxDataDxGxDgT model) throws Exception  {
		String rowid=addThenReturnRowid(model);
		return  getBxDataDxGxDgTByRowId(rowid);
	}
	
	
	public String addThenReturnRowid(BxDataDxGxDgT model) throws Exception  {
		
				model.setTuid(getSeq());
		
		StringBuffer sql = new StringBuffer("insert into bx_data_dx_gx_dg_t("
				+" oldpackageid "
				+",oldproductid "
				+",optype "
				+",packageid "
				+",productid "
				+",streamingno "
				+",userid "
				+",useridtype "
				+",veruserid "
				+",createdate "
				+",tuid "
		
		+") values("
		
					+":oldpackageid"
					+",:oldproductid"
					+",:optype"
					+",:packageid"
					+",:productid"
					+",:streamingno"
					+",:userid"
					+",:useridtype"
					+",:veruserid"
					+",:createdate"
					+",:tuid"
		  + ")" );
		  
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		namedParameterJdbcTemplate.update(sql.toString(), sps,keyHolder);
		oracle.sql.ROWID id=(ROWID) keyHolder.getKeys().get("ROWID");
		return id.stringValue();
	}
	
	
	public BxDataDxGxDgT getBxDataDxGxDgTByRowId(String rowid) throws Exception {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gx_dg_t t where rowid='"+rowid+"'");
		List<BxDataDxGxDgT> modellist = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper(BxDataDxGxDgT.class));
		if(modellist!=null && modellist.size()==1)
		{
			return  modellist.get(0);
		}else{
			throw new Exception("rowid is wrong:"+rowid);
		}
	}
	
	
	//@TriggersRemove(cacheName = "BxDataDxGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByCoud(BxDataDxGxDgT model) {
		
		StringBuffer sql=new StringBuffer("delete from bx_data_dx_gx_dg_t where 1=1 ");
		if(model.getOldpackageid()!=null)
		{
			sql.append(" and oldpackageid=:oldpackageid ");
		}
		if(model.getOldproductid()!=null)
		{
			sql.append(" and oldproductid=:oldproductid ");
		}
		if(model.getOptype()!=null)
		{
			sql.append(" and optype=:optype ");
		}
		if(model.getPackageid()!=null)
		{
			sql.append(" and packageid=:packageid ");
		}
		if(model.getProductid()!=null)
		{
			sql.append(" and productid=:productid ");
		}
		if(model.getStreamingno()!=null)
		{
			sql.append(" and streamingno=:streamingno ");
		}
		if(model.getUserid()!=null)
		{
			sql.append(" and userid=:userid ");
		}
		if(model.getUseridtype()!=null)
		{
			sql.append(" and useridtype=:useridtype ");
		}
		if(model.getVeruserid()!=null)
		{
			sql.append(" and veruserid=:veruserid ");
		}
		if(model.getCreatedate()!=null)
		{
			sql.append(" and createdate=:createdate ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "BxDataDxGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByExact(BxDataDxGxDgT model) throws Exception  {
		
		StringBuffer sql=new StringBuffer("delete from bx_data_dx_gx_dg_t where 1=1 ");
		sql.append(" and oldpackageid=:oldpackageid ");
		sql.append(" and oldproductid=:oldproductid ");
		sql.append(" and optype=:optype ");
		sql.append(" and packageid=:packageid ");
		sql.append(" and productid=:productid ");
		sql.append(" and streamingno=:streamingno ");
		sql.append(" and userid=:userid ");
		sql.append(" and useridtype=:useridtype ");
		sql.append(" and veruserid=:veruserid ");
		sql.append(" and createdate=:createdate ");
		sql.append(" and tuid=:tuid ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "BxDataDxGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByRowId(String rowid)  throws Exception  {
		if(StringUtil.isEmptyOrWhitespace(rowid))
		{
			throw new Exception("rowid is null");
		}
		StringBuffer sql=new StringBuffer("delete from bx_data_dx_gx_dg_t where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
	//@TriggersRemove(cacheName = "BxDataDxGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateExactByRowId(BxDataDxGxDgT model)  throws Exception  {
		if(StringUtil.isEmptyOrWhitespace(model.getRowid()))
		{
			throw new Exception("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  bx_data_dx_gx_dg_t set ");
					sql.append("oldpackageid=:oldpackageid , ");
					sql.append("oldproductid=:oldproductid , ");
					sql.append("optype=:optype , ");
					sql.append("packageid=:packageid , ");
					sql.append("productid=:productid , ");
					sql.append("streamingno=:streamingno , ");
					sql.append("userid=:userid , ");
					sql.append("useridtype=:useridtype , ");
					sql.append("veruserid=:veruserid , ");
					sql.append("createdate=:createdate , ");
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getRowid()+"'");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "BxDataDxGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateCoudByRowId(BxDataDxGxDgT model)  throws Exception  {
		if(StringUtil.isEmptyOrWhitespace(model.getRowid()))
		{
			throw new Exception("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  bx_data_dx_gx_dg_t set ");
					if(model.getOldpackageid()!=null)
					{
						sql.append("oldpackageid=:oldpackageid  ,");
					}
					if(model.getOldproductid()!=null)
					{
						sql.append("oldproductid=:oldproductid  ,");
					}
					if(model.getOptype()!=null)
					{
						sql.append("optype=:optype  ,");
					}
					if(model.getPackageid()!=null)
					{
						sql.append("packageid=:packageid  ,");
					}
					if(model.getProductid()!=null)
					{
						sql.append("productid=:productid  ,");
					}
					if(model.getStreamingno()!=null)
					{
						sql.append("streamingno=:streamingno  ,");
					}
					if(model.getUserid()!=null)
					{
						sql.append("userid=:userid  ,");
					}
					if(model.getUseridtype()!=null)
					{
						sql.append("useridtype=:useridtype  ,");
					}
					if(model.getVeruserid()!=null)
					{
						sql.append("veruserid=:veruserid  ,");
					}
					if(model.getCreatedate()!=null)
					{
						sql.append("createdate=:createdate  ,");
					}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getRowid()+"'");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	
	//@TriggersRemove(cacheName = "BxDataDxGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateByCoudAndWhere(BxDataDxGxDgT model,BxDataDxGxDgT wheremodel)  throws Exception  {
		
		boolean haspk=false;
					haspk=true;
		
		if(haspk=false)
		{
			throw new Exception("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  bx_data_dx_gx_dg_t set ");
					if(model.getOldpackageid()!=null)
					{
						sql.append("oldpackageid=:oldpackageid  ,");
					}
					if(model.getOldproductid()!=null)
					{
						sql.append("oldproductid=:oldproductid  ,");
					}
					if(model.getOptype()!=null)
					{
						sql.append("optype=:optype  ,");
					}
					if(model.getPackageid()!=null)
					{
						sql.append("packageid=:packageid  ,");
					}
					if(model.getProductid()!=null)
					{
						sql.append("productid=:productid  ,");
					}
					if(model.getStreamingno()!=null)
					{
						sql.append("streamingno=:streamingno  ,");
					}
					if(model.getUserid()!=null)
					{
						sql.append("userid=:userid  ,");
					}
					if(model.getUseridtype()!=null)
					{
						sql.append("useridtype=:useridtype  ,");
					}
					if(model.getVeruserid()!=null)
					{
						sql.append("veruserid=:veruserid  ,");
					}
					if(model.getCreatedate()!=null)
					{
						sql.append("createdate=:createdate  ,");
					}
		
		if(sql.lastIndexOf(",")==sql.length()-1)
		{
			sql=new StringBuffer(sql.substring(0,sql.length()-2));
		}
		
		
		StringBuffer where=new StringBuffer("");
					if(wheremodel.getOldpackageid()!=null)
					{
						where.append("and oldpackageid=:oldpackageid  ,");
					}
					if(wheremodel.getOldproductid()!=null)
					{
						where.append("and oldproductid=:oldproductid  ,");
					}
					if(wheremodel.getOptype()!=null)
					{
						where.append("and optype=:optype  ,");
					}
					if(wheremodel.getPackageid()!=null)
					{
						where.append("and packageid=:packageid  ,");
					}
					if(wheremodel.getProductid()!=null)
					{
						where.append("and productid=:productid  ,");
					}
					if(wheremodel.getStreamingno()!=null)
					{
						where.append("and streamingno=:streamingno  ,");
					}
					if(wheremodel.getUserid()!=null)
					{
						where.append("and userid=:userid  ,");
					}
					if(wheremodel.getUseridtype()!=null)
					{
						where.append("and useridtype=:useridtype  ,");
					}
					if(wheremodel.getVeruserid()!=null)
					{
						where.append("and veruserid=:veruserid  ,");
					}
					if(wheremodel.getCreatedate()!=null)
					{
						where.append("and createdate=:createdate  ,");
					}
		if(where.equals(""))
		{
			throw new Exception(" must have where condition"); 
		}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where 1=1  "+where.toString());
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	/*
	//@TriggersRemove(cacheName = "BxDataDxGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchInsert(List<BxDataDxGxDgT> list)  throws Exception{
		
		StringBuffer sql = new StringBuffer("insert into bx_data_dx_gx_dg_t("
				+" oldpackageid "
				+",oldproductid "
				+",optype "
				+",packageid "
				+",productid "
				+",streamingno "
				+",userid "
				+",useridtype "
				+",veruserid "
				+",createdate "
				+",tuid "
		
		+") values("
		
				+"?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",bx_data_dx_gx_dg_t_s.nextval"
		  + ")" );
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setString(1, list.get(i).getOldpackageid());
					ps.setString(2, list.get(i).getOldproductid());
					ps.setString(3, list.get(i).getOptype());
					ps.setString(4, list.get(i).getPackageid());
					ps.setString(5, list.get(i).getProductid());
					ps.setString(6, list.get(i).getStreamingno());
					ps.setString(7, list.get(i).getUserid());
					ps.setString(8, list.get(i).getUseridtype());
					ps.setString(9, list.get(i).getVeruserid());
					ps.setDate(10, list.get(i).getCreatedate());
					ps.setString(11, list.get(i).getTuid());
					
					ps.addBatch();
					ps.clearParameters();
					if(i%500==0 || i==list.size()-1)
					{
						ps.executeBatch(); 
					}
			  }
			  ps.close();
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}finally{
			JdbcUtils.closeStatement(ps);  
			DataSourceUtils.releaseConnection(conn, jdbcTemplate.getDataSource());  
		}
		
	}
	
	//@TriggersRemove(cacheName = "BxDataDxGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchUpdate(List<BxDataDxGxDgT> list)  throws Exception{
		
		boolean haspk=false;
					haspk=true;
		
		if(haspk=false)
		{
			throw new Exception("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  bx_data_dx_gx_dg_t set ");
						sql.append("oldpackageid=? ,");
						sql.append("oldproductid=? ,");
						sql.append("optype=? ,");
						sql.append("packageid=? ,");
						sql.append("productid=? ,");
						sql.append("streamingno=? ,");
						sql.append("userid=? ,");
						sql.append("useridtype=? ,");
						sql.append("veruserid=? ,");
						sql.append("createdate=? ,");
		
		if(sql.lastIndexOf(",")==sql.length()-1)
		{
			sql=new StringBuffer(sql.substring(0,sql.length()-2));
		}
		
		StringBuffer where=new StringBuffer(" where 1=1 ");
					where.append(" and tuid=?");
		sql.append(where.toString());
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setString(1, list.get(i).getOldpackageid());
					ps.setString(2, list.get(i).getOldproductid());
					ps.setString(3, list.get(i).getOptype());
					ps.setString(4, list.get(i).getPackageid());
					ps.setString(5, list.get(i).getProductid());
					ps.setString(6, list.get(i).getStreamingno());
					ps.setString(7, list.get(i).getUserid());
					ps.setString(8, list.get(i).getUseridtype());
					ps.setString(9, list.get(i).getVeruserid());
					ps.setDate(10, list.get(i).getCreatedate());
					ps.setString(11, list.get(i).getTuid());
					
					ps.addBatch();
					ps.clearParameters();
					if(i%500==0 || i==list.size()-1)
					{
						ps.executeBatch(); 
					}
			  }
			  ps.close();
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}finally{
			JdbcUtils.closeStatement(ps);  
			DataSourceUtils.releaseConnection(conn, jdbcTemplate.getDataSource());  
		}
	}
	*/
	
	//@Cacheable(cacheName = "BxDataDxGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataDxGxDgT> getBxDataDxGxDgTListByCoud(BxDataDxGxDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gx_dg_t t where 1=1 ");
		if(model.getOldpackageid()!=null)
		{
			sql.append(" and oldpackageid=:oldpackageid ");
		}
		if(model.getOldproductid()!=null)
		{
			sql.append(" and oldproductid=:oldproductid ");
		}
		if(model.getOptype()!=null)
		{
			sql.append(" and optype=:optype ");
		}
		if(model.getPackageid()!=null)
		{
			sql.append(" and packageid=:packageid ");
		}
		if(model.getProductid()!=null)
		{
			sql.append(" and productid=:productid ");
		}
		if(model.getStreamingno()!=null)
		{
			sql.append(" and streamingno=:streamingno ");
		}
		if(model.getUserid()!=null)
		{
			sql.append(" and userid=:userid ");
		}
		if(model.getUseridtype()!=null)
		{
			sql.append(" and useridtype=:useridtype ");
		}
		if(model.getVeruserid()!=null)
		{
			sql.append(" and veruserid=:veruserid ");
		}
		if(model.getCreatedate()!=null)
		{
			sql.append(" and createdate=:createdate ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<BxDataDxGxDgT> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(BxDataDxGxDgT.class));
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataDxGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataDxGxDgT> getBxDataDxGxDgTListByExact(BxDataDxGxDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gx_dg_t t where 1=1 ");
			sql.append(" and oldpackageid=:oldpackageid ");
			sql.append(" and oldproductid=:oldproductid ");
			sql.append(" and optype=:optype ");
			sql.append(" and packageid=:packageid ");
			sql.append(" and productid=:productid ");
			sql.append(" and streamingno=:streamingno ");
			sql.append(" and userid=:userid ");
			sql.append(" and useridtype=:useridtype ");
			sql.append(" and veruserid=:veruserid ");
			sql.append(" and createdate=:createdate ");
			sql.append(" and tuid=:tuid ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<BxDataDxGxDgT> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(BxDataDxGxDgT.class));
		return modellist;
	}
	
	
	
	//@Cacheable(cacheName = "BxDataDxGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByCoud(BxDataDxGxDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gx_dg_t  t where 1=1 ");
		if(model.getOldpackageid()!=null)
		{
			sql.append(" and oldpackageid=:oldpackageid ");
		}
		if(model.getOldproductid()!=null)
		{
			sql.append(" and oldproductid=:oldproductid ");
		}
		if(model.getOptype()!=null)
		{
			sql.append(" and optype=:optype ");
		}
		if(model.getPackageid()!=null)
		{
			sql.append(" and packageid=:packageid ");
		}
		if(model.getProductid()!=null)
		{
			sql.append(" and productid=:productid ");
		}
		if(model.getStreamingno()!=null)
		{
			sql.append(" and streamingno=:streamingno ");
		}
		if(model.getUserid()!=null)
		{
			sql.append(" and userid=:userid ");
		}
		if(model.getUseridtype()!=null)
		{
			sql.append(" and useridtype=:useridtype ");
		}
		if(model.getVeruserid()!=null)
		{
			sql.append(" and veruserid=:veruserid ");
		}
		if(model.getCreatedate()!=null)
		{
			sql.append(" and createdate=:createdate ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataDxGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByExact(BxDataDxGxDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gx_dg_t t where 1=1 ");
			sql.append(" and oldpackageid=:oldpackageid ");
			sql.append(" and oldproductid=:oldproductid ");
			sql.append(" and optype=:optype ");
			sql.append(" and packageid=:packageid ");
			sql.append(" and productid=:productid ");
			sql.append(" and streamingno=:streamingno ");
			sql.append(" and userid=:userid ");
			sql.append(" and useridtype=:useridtype ");
			sql.append(" and veruserid=:veruserid ");
			sql.append(" and createdate=:createdate ");
			sql.append(" and tuid=:tuid ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataDxGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataDxGxDgT>  getPageListByCound(BxDataDxGxDgT model, int pageIndex,int rows)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gx_dg_t t where 1=1 ");
		if(model.getOldpackageid()!=null)
		{
			sql.append(" and oldpackageid=:oldpackageid ");
		}
		if(model.getOldproductid()!=null)
		{
			sql.append(" and oldproductid=:oldproductid ");
		}
		if(model.getOptype()!=null)
		{
			sql.append(" and optype=:optype ");
		}
		if(model.getPackageid()!=null)
		{
			sql.append(" and packageid=:packageid ");
		}
		if(model.getProductid()!=null)
		{
			sql.append(" and productid=:productid ");
		}
		if(model.getStreamingno()!=null)
		{
			sql.append(" and streamingno=:streamingno ");
		}
		if(model.getUserid()!=null)
		{
			sql.append(" and userid=:userid ");
		}
		if(model.getUseridtype()!=null)
		{
			sql.append(" and useridtype=:useridtype ");
		}
		if(model.getVeruserid()!=null)
		{
			sql.append(" and veruserid=:veruserid ");
		}
		if(model.getCreatedate()!=null)
		{
			sql.append(" and createdate=:createdate ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<BxDataDxGxDgT> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<BxDataDxGxDgT>(BxDataDxGxDgT.class));
		
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataDxGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataDxGxDgT>  getPageListByExact(BxDataDxGxDgT model, int pageIndex,int rows)   throws Exception {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gx_dg_t t where 1=1 ");
			if(model.getOldpackageid()!=null)
			{
				sql.append(" and oldpackageid=:oldpackageid ");
			}
			if(model.getOldproductid()!=null)
			{
				sql.append(" and oldproductid=:oldproductid ");
			}
			if(model.getOptype()!=null)
			{
				sql.append(" and optype=:optype ");
			}
			if(model.getPackageid()!=null)
			{
				sql.append(" and packageid=:packageid ");
			}
			if(model.getProductid()!=null)
			{
				sql.append(" and productid=:productid ");
			}
			if(model.getStreamingno()!=null)
			{
				sql.append(" and streamingno=:streamingno ");
			}
			if(model.getUserid()!=null)
			{
				sql.append(" and userid=:userid ");
			}
			if(model.getUseridtype()!=null)
			{
				sql.append(" and useridtype=:useridtype ");
			}
			if(model.getVeruserid()!=null)
			{
				sql.append(" and veruserid=:veruserid ");
			}
			if(model.getCreatedate()!=null)
			{
				sql.append(" and createdate=:createdate ");
			}
			if(model.getTuid()!=null)
			{
				sql.append(" and tuid=:tuid ");
			}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<BxDataDxGxDgT> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<BxDataDxGxDgT>(BxDataDxGxDgT.class));
		
		return modellist;
	}
	
	
	
	
	
	
	
	public List<BxDataDxGxDgT>  getPageListByBxDataDxGxDgTList(ArrayList<BxDataDxGxDgT> modellist, int pageIndex,int rows) throws Exception  {
		int startindex=(pageIndex-1)*rows+1;
		int endindex=pageIndex*rows;
		if(endindex>modellist.size()-1)
		{
			modellist.subList(startindex, endindex);
		}else{
			modellist.subList(startindex, modellist.size()-1);
		}
		return modellist;
	}
	
	
	public BxDataDxGxDgT getBxDataDxGxDgTByCoud(BxDataDxGxDgT model)  throws Exception  {
		List<BxDataDxGxDgT> modellist =getBxDataDxGxDgTListByCoud(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	
	public BxDataDxGxDgT getBxDataDxGxDgTByExact(BxDataDxGxDgT model)  throws Exception  {
		List<BxDataDxGxDgT> modellist =getBxDataDxGxDgTListByExact(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	public String  getSeq() {
		String sql="select bx_data_dx_gx_dg_t_s.nextval as seqid from dual";
		
		List<Map<String, Object>> resultlist =null;
		try{
			
			resultlist = jdbcTemplate.queryForList(sql);
			if(resultlist.size()==1){
							Map<String, Object>  map = resultlist.get(0);
							BigDecimal seqid = (BigDecimal) map.get("SEQID");
							return seqid.toString();
			}
		}catch(Exception ex)
		{
			String createseq="create sequence bx_data_dx_gx_dg_t_s minvalue 1 maxvalue 999999999999999999999999 start with 1 increment by 1";
			jdbcTemplate.update(createseq);
			resultlist = jdbcTemplate.queryForList(sql);
			if(resultlist.size()==1){
						Map<String, Object>  map = resultlist.get(0);
						BigDecimal seqid = (BigDecimal) map.get("SEQID");
						return seqid.toString();
			}
		}
		return "";
	}
	
	
	
	public int deleteByRowid(String rowid)  throws Exception  {
		StringBuffer sql=new StringBuffer("delete  from  bx_data_dx_gx_dg_t  where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
}