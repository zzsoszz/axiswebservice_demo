package com.bxtel.bxdatadxgxdg.model;
import com.bxtel.bxdatadxgxdg.*;
import java.util.*;
public class BxDataDxGxDgT  
{
	
		 public String oldpackageid;//被替换套餐标识,（当OPType为6时，该字段有效）
		 public String oldproductid;//被替换产品标识,（当OPType为6时，该字段有效）
		 public String optype;//0：定购 1：暂停 2：暂停恢复 3：退定 4：退定该SP的所有产品和套餐 5：暂停该SP的所有产品和套餐 6：替换
		 public String packageid;//套餐标识
		 public String productid;//产品标识
		 public String streamingno;//流水号，可用于调用／提供双方比较接口调用情况	 60位，从0开始，用满归零
		 public String userid;//用户号码
		 public String useridtype;//0:MSISDN 1:PHS 2：PSTN 3:Pseudo Code
		 public String veruserid;//veruserid
		 public Date createdate;//createdate
		 public String tuid;//tuid
		public String totalCount;
		public String rowid;
	
		
		 public void setOldpackageid(String oldpackageid)
		 {
		 	this.oldpackageid=oldpackageid;
		 }
		 public String getOldpackageid()
		 {
		 	return this.oldpackageid;
		 }
		 public void setOldproductid(String oldproductid)
		 {
		 	this.oldproductid=oldproductid;
		 }
		 public String getOldproductid()
		 {
		 	return this.oldproductid;
		 }
		 public void setOptype(String optype)
		 {
		 	this.optype=optype;
		 }
		 public String getOptype()
		 {
		 	return this.optype;
		 }
		 public void setPackageid(String packageid)
		 {
		 	this.packageid=packageid;
		 }
		 public String getPackageid()
		 {
		 	return this.packageid;
		 }
		 public void setProductid(String productid)
		 {
		 	this.productid=productid;
		 }
		 public String getProductid()
		 {
		 	return this.productid;
		 }
		 public void setStreamingno(String streamingno)
		 {
		 	this.streamingno=streamingno;
		 }
		 public String getStreamingno()
		 {
		 	return this.streamingno;
		 }
		 public void setUserid(String userid)
		 {
		 	this.userid=userid;
		 }
		 public String getUserid()
		 {
		 	return this.userid;
		 }
		 public void setUseridtype(String useridtype)
		 {
		 	this.useridtype=useridtype;
		 }
		 public String getUseridtype()
		 {
		 	return this.useridtype;
		 }
		 public void setVeruserid(String veruserid)
		 {
		 	this.veruserid=veruserid;
		 }
		 public String getVeruserid()
		 {
		 	return this.veruserid;
		 }
		 public void setCreatedate(Date createdate)
		 {
		 	this.createdate=createdate;
		 }
		 public Date getCreatedate()
		 {
		 	return this.createdate;
		 }
		 public void setTuid(String tuid)
		 {
		 	this.tuid=tuid;
		 }
		 public String getTuid()
		 {
		 	return this.tuid;
		 }
	
	
		public String getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}
		
		public String getRowid() {
			return rowid;
		}
		public void setRowid(String rowid) {
			this.rowid = rowid;
		}
		
	/*
		 model.setOldpackageid("oldpackageidvalue");
		 model.setOldproductid("oldproductidvalue");
		 model.setOptype("optypevalue");
		 model.setPackageid("packageidvalue");
		 model.setProductid("productidvalue");
		 model.setStreamingno("streamingnovalue");
		 model.setUserid("useridvalue");
		 model.setUseridtype("useridtypevalue");
		 model.setVeruserid("veruseridvalue");
		 model.setCreatedate("createdatevalue");
		 model.setTuid("tuidvalue");
		 model.getOldpackageid();
		 model.getOldproductid();
		 model.getOptype();
		 model.getPackageid();
		 model.getProductid();
		 model.getStreamingno();
		 model.getUserid();
		 model.getUseridtype();
		 model.getVeruserid();
		 model.getCreatedate();
		 model.getTuid();
	*/
}

