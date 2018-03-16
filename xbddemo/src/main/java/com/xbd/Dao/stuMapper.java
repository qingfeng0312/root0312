package com.xbd.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xbd.Entity.student;


@Repository
public interface stuMapper {

  public int insertStu(student stu);
  public int deleteStu(student stu);
  public int updateStu(student stu);
  public List<student> selectStu(student stu);
  public student oneStu(Integer id);
}
