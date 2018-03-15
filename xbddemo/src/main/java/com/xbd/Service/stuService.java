package com.xbd.Service;

import java.util.List;

import com.xbd.Entity.student;


public interface stuService {
  
  public int insertStu(student stu);
  public int deleteStu(student stu);
  public int updateStu(student stu);
  public List<student> selectStu(student stu);
  public student oneStu(Integer id);

}
