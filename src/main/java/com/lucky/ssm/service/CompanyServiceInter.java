package com.lucky.ssm.service;

import java.util.List;

import com.lucky.ssm.bean.Company;

/**
 * 公司业务逻辑接口类
 * @author LiuWang
 * @createTime 2019年1月8日上午9:45:27
 */
public interface CompanyServiceInter {
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
