package com.bxtel.bxdatadxgxdg.bo;
import com.bxtel.bxdatadxgxdg.model.*;
import com.bxtel.bxdatadxgxdg.dao.*;
import com.bxtel.exception.BusinessException;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import dinamica.*;
import dinamica.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;


@Service("BxDataDxGxDgTBO")
public class BxDataDxGxDgTBO 
{
	@Resource
	public BxDataDxGxDgTDAO dao;
	
	private static final Log logger = LogFactory.getLog(BxDataDxGxDgTBO.class);
	
	public BxDataDxGxDgT add(BxDataDxGxDgT model)  throws BusinessException  {
		try {
			return dao.add(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	public int delete(BxDataDxGxDgT model)   throws BusinessException  {
		try {
			return dao.deleteByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	public int update(BxDataDxGxDgT model)  throws BusinessException  {
		try {
			return dao.updateCoudByRowId(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	public int updateByCoudAndWhere(BxDataDxGxDgT model,BxDataDxGxDgT wheremodel)  throws BusinessException  {
		try {
			return dao.updateByCoudAndWhere(model,wheremodel);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public List<BxDataDxGxDgT> getBxDataDxGxDgTListByCoud(BxDataDxGxDgT model)   throws BusinessException  {
		try {
			return dao.getBxDataDxGxDgTListByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public List<BxDataDxGxDgT> getBxDataDxGxDgTListByExact(BxDataDxGxDgT model)  throws BusinessException  {
		try {
			return dao.getBxDataDxGxDgTListByExact(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	
	
	public BxDataDxGxDgT getBxDataDxGxDgTByCoud(BxDataDxGxDgT model)  throws BusinessException  {
		try {
			return dao.getBxDataDxGxDgTByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	public BxDataDxGxDgT getBxDataDxGxDgTByExact(BxDataDxGxDgT model)  throws BusinessException  {
		try {
			return dao.getBxDataDxGxDgTByExact(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	
	
	public List<Map<String, Object>> getListMapByCoud(BxDataDxGxDgT model)  throws BusinessException {
		try {
			return dao.getListMapByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public List<Map<String, Object>> getListMapByExact(BxDataDxGxDgT model)   throws BusinessException {
		try {
			return dao.getListMapByExact(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public ListAndTotalCount<BxDataDxGxDgT> getPageList(BxDataDxGxDgT model, int pageIndex,int rows)  throws BusinessException 
	{
		try {
		
			List<BxDataDxGxDgT> list = dao.getPageListByCound(model,pageIndex,rows);
			ListAndTotalCount<BxDataDxGxDgT> lst = new ListAndTotalCount<BxDataDxGxDgT>();
			if(list!=null&& list.size()>0)
			{
				lst.setTotal(list.get(0).getTotalCount());
				lst.setRows(list);
			}
			return lst;
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
}