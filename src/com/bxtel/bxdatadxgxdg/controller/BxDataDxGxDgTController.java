package com.bxtel.bxdatadxgxdg.controller;
import com.bxtel.bxdatadxgxdg.bo.*;
import com.bxtel.bxdatadxgxdg.model.*;

import com.bxtel.exception.BusinessException;
import dinamica.util.ListAndTotalCount;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


//com/bxtel/bxdatadxgxdg/controller/bxdatadxgxdgt/showadd.do
//com/bxtel/bxdatadxgxdg/controller/bxdatadxgxdgt/showdetail.do
//com/bxtel/bxdatadxgxdg/controller/bxdatadxgxdgt/showedit.do
//com/bxtel/bxdatadxgxdg/controller/bxdatadxgxdgt/showsearch.do
//com/bxtel/bxdatadxgxdg/controller/bxdatadxgxdgt/showpagelist.do
//com/bxtel/bxdatadxgxdg/controller/bxdatadxgxdgt/showlist.do
//com/bxtel/bxdatadxgxdg/controller/bxdatadxgxdgt/doadd.do
//com/bxtel/bxdatadxgxdg/controller/bxdatadxgxdgt/doupdate.do
//com/bxtel/bxdatadxgxdg/controller/bxdatadxgxdgt/dodelete.do


@Controller
public class BxDataDxGxDgTController extends MultiActionController {
	    
    @Resource
	public BxDataDxGxDgTBO  bo;
    
    private static final Log logger = LogFactory.getLog(BxDataDxGxDgTController.class);
    
    
    @RequestMapping
    public ModelAndView showadd(BxDataDxGxDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showdetail(BxDataDxGxDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        BxDataDxGxDgT  model_result=bo.getBxDataDxGxDgTByCoud(model);
        if(model_result!=null)
    	{
    		 mav = new ModelAndView();
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showedit(BxDataDxGxDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        BxDataDxGxDgT  model_result=bo.getBxDataDxGxDgTByCoud(model);
        if(model_result!=null)
    	{
    		 mav = new ModelAndView();
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showsearch(BxDataDxGxDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
   
    
    @RequestMapping
    public ModelAndView showlist(BxDataDxGxDgT model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<BxDataDxGxDgT>  modellist=bo.getPageList(model,pageindex,rows);
		if(Integer.parseInt(modellist.getTotal())>0)
    	{
    		mav = new ModelAndView();
   		 	mav.addObject("modellist",modellist);
    	}
		else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    @RequestMapping
    public ModelAndView listdata(BxDataDxGxDgT model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<BxDataDxGxDgT>  modellist=bo.getPageList(model,pageindex,rows);
		if(Integer.parseInt(modellist.getTotal())>0)
    	{
    		mav = new ModelAndView();
   		 	mav.addObject("modellist",modellist);
    	}
		else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView doadd(BxDataDxGxDgT model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
    	if(bo.add(model)!=null)
    	{
    		 mav = new ModelAndView("showdetail");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    @RequestMapping
    public ModelAndView dodelete(BxDataDxGxDgT model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
       	ModelAndView mav=null;
       	if(bo.delete(model)>0)
    	{
    		 mav = new ModelAndView("forward:showsearch");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView doupdate(BxDataDxGxDgT model,HttpServletRequest request, HttpServletResponse response) throws Exception, BusinessException{
	    ModelAndView mav=null;
    	if(bo.update(model)>0)
    	{
    		 mav = new ModelAndView("forward:showedit");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
}