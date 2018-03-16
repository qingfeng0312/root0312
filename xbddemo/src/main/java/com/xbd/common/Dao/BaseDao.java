package com.xbd.common.Dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hehuannan
 * @since 2018-03-16
 */
public abstract class BaseDao<T> extends SqlSessionDaoSupport {
	/**
	 * 注入SqlSessionTemplate实例(要求Spring中进行SqlSessionTemplate的配制)
	 * 可以调用sessionTemplate完成数据库操作
	 */
	@Autowired
	private SqlSessionTemplate sessionTemplate;

	public SqlSessionTemplate getSessionTemplate() {
		return sessionTemplate;
	}

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}
	
	public SqlSession getSqlSession() {
		return super.getSqlSession();
	}
	
	/**
	 * 获取Mapper命名空间.
	 * 
	 * @param sqlId
	 * @return
	 */
	public String getStatement(String sqlId) {
		String name = this.getClass().getName();
		StringBuffer sb = new StringBuffer();
		sb.append(name).append(".").append(sqlId);
		String statement = sb.toString();

		return statement;
	}
	public abstract int deleteByPK(T record);
	public abstract int insertByPK(T record);
	public abstract int insertBySelective(T record);
	public abstract T selectByPK(T record);
	public abstract int updateBySelective(T record);
	public abstract int updateByPK(T record);
}
