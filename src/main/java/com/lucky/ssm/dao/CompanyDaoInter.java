package com.lucky.ssm.dao;

import java.util.List;

import com.lucky.ssm.bean.Company;

/**
 * 公司数据访问接口类
 * @author LiuWang
 * @createTime 2019年1月8日上午9:28:14
 */
public interface CompanyDaoInter {
	/**
	 * 查询所有公司的信息
	 * @return 返回查询到的公司信息集合
	 */
	List<Company> searchAllCompany();
	
	/**
	 * 删除指定编号的公司信息
	 * @param company 公司对象bean
	 * @return 删除成功的影响行数
	 */
	int deleteCompany(Company company);
}
