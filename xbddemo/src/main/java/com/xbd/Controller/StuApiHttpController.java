package com.xbd.Controller;

import java.util.ArrayList;
import java.util.List;

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
import com.xbd.common.utils.Result;

@Controller
@RequestMapping(value = "/stu")
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
	 
	@ResponseBody
    @RequestMapping(value = "/stuInfo")
    public Result saveEntrusGoodsInfo(HttpServletRequest request) {
        Result<List<student>> reslut = new Result<List<student>>();
        LOG.info("接口");
        student reen = new student();
        reen.setStuAge(34);
        reen.setStuName("广告费大哥");
        List<student> list = new ArrayList<student>();
        list.add(reen);
        reslut.setCode(Constant.JUDGE_CODE_ZERO);
        reslut.setMsg("接口名称");
        reslut.setData(list);
        return reslut;
    }

}
