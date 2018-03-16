package com.xbd.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xbd.Dao.stuMapper;
import com.xbd.Entity.student;
import com.xbd.Service.stuService;


@Service
public class stuServiceImpl implements stuService {
 @Autowired
  private stuMapper studao;

  @Override
  public int insertStu(student stu) {
    return studao.insertStu(stu);
  }

  @Override
  public int deleteStu(student stu) {
    return studao.deleteStu(stu);
  }

  @Override
  public int updateStu(student stu) {
    return studao.updateStu(stu);
  }

  @Override
  public List<student> selectStu(student stu) {
    return studao.selectStu(stu);
  }

  @Override
  public student oneStu(Integer id) {
    return studao.oneStu(id);
  }


}
