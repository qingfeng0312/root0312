package com.xbd.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.xbd.Entity.student;
import com.xbd.Service.stuService;


@Controller
@RequestMapping(value = "/stu")
public class stuController {
  @Resource
  private stuService stuservice;
  
  @RequestMapping(value = "/shouye")
  public ModelAndView shouye(HttpServletRequest request) {
    return new ModelAndView("index");
  }

  @RequestMapping(value = "/add")
  public ModelAndView add(HttpServletRequest request) {
    return new ModelAndView("stu/add_stu");
  }
  
  @RequestMapping(value = "/stuAdd")
  public ModelAndView addStu(HttpServletRequest request, student stu) {
    stuservice.insertStu(stu);
    return new ModelAndView("stu/add_stu");
  }

  @RequestMapping(value = "/stuSelect")
  public ModelAndView selectStu(HttpServletRequest request) {
    student reen = new student();
    List<student> list = stuservice.selectStu(reen);
    request.setAttribute("list", list);
    return new ModelAndView("stu/show_stu");
  }

  @RequestMapping(value = "/delete")
  public ModelAndView deletestu(HttpServletRequest request, student stu) {
    stuservice.deleteStu(stu);
    return selectStu(request);

  }

  @RequestMapping(value = "/selectOne")
  public ModelAndView oneSelect(HttpServletRequest request, int stuId) {
    student stu = stuservice.oneStu(stuId);
    request.setAttribute("stu", stu);
    return new ModelAndView("stu/update_stu");
  }

  @RequestMapping(value = "updateStu")
  public ModelAndView updateStu(HttpServletRequest request, student stu) {
    stuservice.updateStu(stu);
    return selectStu(request);
  }

  @RequestMapping(value = "/upload",method=RequestMethod.POST)
  public ModelAndView uploadFile(HttpServletRequest request, @RequestParam MultipartFile uploadFile) {
    String fileName = uploadFile.getOriginalFilename(); 
    String upload = request.getSession().getServletContext().getRealPath("upload");
    try {
      FileCopyUtils.copy(uploadFile.getInputStream(), new FileOutputStream(upload + File.separator
          + fileName));
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return new ModelAndView("stu/upload_stu");
  }

}
