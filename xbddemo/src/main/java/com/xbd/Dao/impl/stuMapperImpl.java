package com.xbd.Dao.impl;

import java.util.List;

import com.xbd.Dao.stuMapper;
import com.xbd.Entity.student;
import com.xbd.common.Dao.BaseDaoImpl;

public class stuMapperImpl extends BaseDaoImpl<student> implements stuMapper {

	@Override
	public int insertStu(student stu) {
		return insertByPK(stu);
	}

	@Override
	public int deleteStu(student stu) {
		return deleteByPK(stu);
	}

	@Override
	public int updateStu(student stu) {
		return updateByPK(stu);
	}

	@Override
	public List<student> selectStu(student stu) {
		return getSessionTemplate().selectList(getStatement("selectStu"), stu);
	}

	@Override
	public student oneStu(Integer id) {
		return getSessionTemplate().selectOne(getStatement("oneStu"), id);
	}
	
}
