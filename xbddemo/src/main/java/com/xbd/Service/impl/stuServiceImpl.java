package com.xbd.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xbd.Dao.stuDao;
import com.xbd.Entity.student;
import com.xbd.Service.stuService;


@Service
public class stuServiceImpl implements stuService {
 @Autowired
  private stuDao studao;

  @Override
  public int insertStu(student stu) {
    // TODO Auto-generated method stub
    return studao.insertStu(stu);
  }

  @Override
  public int deleteStu(student stu) {
    // TODO Auto-generated method stub
    return studao.deleteStu(stu);
  }

  @Override
  public int updateStu(student stu) {
    // TODO Auto-generated method stub
    return studao.updateStu(stu);
  }

  @Override
  public List<student> selectStu(student stu) {
    // TODO Auto-generated method stub
    return studao.selectStu(stu);
  }

  @Override
  public student oneStu(Integer id) {
    // TODO Auto-generated method stub
    return studao.oneStu(id);
  }


}
