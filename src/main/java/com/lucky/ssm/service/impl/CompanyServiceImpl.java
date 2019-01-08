package com.lucky.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lucky.ssm.bean.Company;
import com.lucky.ssm.dao.CompanyDaoInter;
import com.lucky.ssm.service.CompanyServiceInter;

/**
 * 公司业务逻辑实现类
 * @author LiuWang
 * @createTime 2019年1月8日上午9:45:21
 */
@Service(value="companyService")
public class CompanyServiceImpl implements CompanyServiceInter {
	//依赖于数据访问接口
	private CompanyDaoInter companyDao;
	//通过set方式注入
	@Resource(name="companyDaoImpl")
	public void setCompanyDao(CompanyDaoInter companyDao) {
		this.companyDao = companyDao;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.lucky.ssm.service.CompanyServiceInter#searchAllCompany()
	 */
	//@Transactional(readOnly=true)
	@Override
	public List<Company> searchAllCompany() {
		return companyDao.searchAllCompany();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.lucky.ssm.service.CompanyServiceInter#deleteCompany(com.lucky.ssm.bean.Company)
	 */
	//@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public int deleteCompany(Company company) {
		return companyDao.deleteCompany(company);
	}

}
