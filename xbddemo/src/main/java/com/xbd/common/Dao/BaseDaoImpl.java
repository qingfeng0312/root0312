package com.xbd.common.Dao;

import com.xbd.common.utils.DataConstants;


public class BaseDaoImpl<T> extends BaseDao<T> {
	@Override
	public int deleteByPK(T record) {
		return getSessionTemplate().delete(getStatement(DataConstants.SQL_DELETE_BY_PK), record);
	}

	@Override
	public int insertByPK(T record) {
		return getSessionTemplate().insert(getStatement(DataConstants.SQL_INSERT), record);
	}

	@Override
	public int insertBySelective(T record) {
		return getSessionTemplate().insert(getStatement(DataConstants.SQL_INSERT_SELECTIVE), record);
	}

	@Override
	public T selectByPK(T record) {
		getSessionTemplate().clearCache();
		return getSessionTemplate().selectOne(getStatement(DataConstants.SQL_GET_BY_PK), record);
	}

	@Override
	public int updateBySelective(T record) {
		return getSessionTemplate().update(getStatement(DataConstants.SQL_UPDATE_SELECTIVE), record);
	}

	@Override
	public int updateByPK(T record) {
		return getSessionTemplate().update(getStatement(DataConstants.SQL_UPDATE_BY_PK), record);
	}
}
