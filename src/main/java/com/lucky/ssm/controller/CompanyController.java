package com.lucky.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lucky.ssm.bean.Company;
import com.lucky.ssm.service.CompanyServiceInter;

/**
 * 公司 Controller
 * @author LiuWang
 * @createTime 2019年1月8日上午10:01:23
 */
@Controller
public class CompanyController {
	//依赖于业务逻辑接口
	private CompanyServiceInter companyService;
	//通过set方式注入
	@Resource(name="companyService")
	public void setCompanyService(CompanyServiceInter companyService) {
		this.companyService = companyService;
	}
	
	/**
	 * 查询所有公司信息
	 * @return 查询到的公司信息集合
	 */
	@RequestMapping(value="/searchAllCompany")
	public ModelAndView searchAllCompany(){
		//调用查询所有公司信息方法
		List<Company> companyList = companyService.searchAllCompany();
		for (Company company : companyList) {
			System.out.println(company);
		}
		//创建模型和视图对象
		ModelAndView modelAndView = new ModelAndView();
		//跳转资源页面
		modelAndView.setViewName("index");
		//返回模型和视图
		return modelAndView;
	}
	
	/**
	 * 查询所有公司信息
	 * @return 查询到的公司信息集合
	 */
	@RequestMapping(value="/deleteCompany")
	public ModelAndView deleteCompany(Company company){
		//调用查询所有公司信息方法
		int rows = companyService.deleteCompany(company);
		System.out.println((rows != 0) ? "success" : "failer");
		//创建模型和视图对象
		ModelAndView modelAndView = new ModelAndView();
		//跳转资源页面
		modelAndView.setViewName("index");
		//返回模型和视图
		return modelAndView;
	}
	
}
