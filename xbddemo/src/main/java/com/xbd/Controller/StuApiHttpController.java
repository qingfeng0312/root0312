package com.xbd.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.fabric.xmlrpc.base.Array;
import com.xbd.Entity.student;
import com.xbd.Service.stuService;
import com.xbd.common.Constant;
import com.xbd.common.utils.JSONUtils;
import com.xbd.common.utils.PropertiesUtils;
import com.xbd.common.utils.Result;
import com.xbd.common.utils.http.HttpclientUtil;

@Controller
@RequestMapping(value = "/student")
public class StuApiHttpController {

	private Log LOG = LogFactory.getLog(this.getClass());
	//private static String scUrl = PropertiesUtils.getProperty("scUrl");
	
	@Resource
	private stuService stuservice;
	
	 @RequestMapping(value = "/shouye")
	  public ModelAndView shouye(HttpServletRequest request) {
		  LOG.warn("___个人特热___");
	    return new ModelAndView("index");
	  }
	 
	//@ResponseBody
    @RequestMapping(value = "/stuInfo1")
    public String saveEntrusGoodsInfo(HttpServletRequest request) {
       /* Result<List<student>> reslut = new Result<List<student>>();
        LOG.info("接口");
        student reen = new student();
        reen.setStuAge(34);
        reen.setStuName("广告费大哥");
        List<student> list = new ArrayList<student>();
        list.add(reen);
        reslut.setCode(Constant.JUDGE_CODE_ZERO);
        reslut.setMsg("接口名称");
        reslut.setData(list);*/
        return "gdhgd";
    }
	
	
	  @RequestMapping(value = "/myAskToBuy")
	  @ResponseBody
	  public Object myAskToBuy(HttpServletRequest request) {
	    Map<String, Object> resMap = new HashMap<String, Object>();
	   
	    Map<String, String> paramMap = new HashMap<String, String>();
	   
	    String scUrl = PropertiesUtils.getProperty("xbd.url");
	    scUrl += "/stu/stuInfo.do";
	    String data = "";
	    Map purchaseMap = null;
	    try {
	      data = HttpclientUtil.postForm(scUrl,paramMap);
	      purchaseMap = JSONUtils.jsonStrToBean(data, Map.class);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    List purchaseList = (List) purchaseMap.get("data");
	    return resMap;
	  }
}
