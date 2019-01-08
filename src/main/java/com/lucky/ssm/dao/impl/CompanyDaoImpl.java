package com.lucky.ssm.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lucky.ssm.bean.Company;
import com.lucky.ssm.dao.CompanyDaoInter;

/**
 * 公司数据访问实现类
 * @author LiuWang
 * @createTime 2019年1月8日上午9:31:19
 */
public class CompanyDaoImpl implements CompanyDaoInter {
	//依赖sqlsessionfactory
	private SqlSessionFactory sqlsessionFactory;
	//通过setter方式注入
	public void setSqlsessionFactory(SqlSessionFactory sqlsessionFactory) {
		this.sqlsessionFactory = sqlsessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * @see com.lucky.ssm.dao.CompanyDaoInter#searchAllCompany()
	 */
	@Override
	public List<Company> searchAllCompany() {
		SqlSession sqlSession = sqlsessionFactory.openSession();
		String statementKey = "com.lucky.ssm.dao.CompanyDaoInter.searchAllCompany";
		List<Company> companyList = sqlSession.selectList(statementKey);
		return companyList;
	}

	@Override
	public int deleteCompany(Company company) {
		SqlSession sqlSession = sqlsessionFactory.openSession();
		String statementKey = "com.lucky.ssm.dao.CompanyDaoInter.deleteCompany";
		int rows = sqlSession.delete(statementKey, company);
		return rows;
	}

}
