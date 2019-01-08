package com.lucky.ssm.bean;

/**
 * 公司（组织机构） bean
 * @author LiuWang
 * @createTime 2019年1月8日上午9:10:52
 */
public class Company {
	/** 公司编号 */
	private String comNo;
	/** 公司名称 */
	private String comName;
	/** 公司地址 */
	private String comAddress;
	/** 公司电话 */
	private String comPhone;
	/** 公司备注 */
	private String comContext;

	public String getComNo() {
		return comNo;
	}

	public void setComNo(String comNo) {
		this.comNo = comNo;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComAddress() {
		return comAddress;
	}

	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}

	public String getComPhone() {
		return comPhone;
	}

	public void setComPhone(String comPhone) {
		this.comPhone = comPhone;
	}

	public String getComContext() {
		return comContext;
	}

	public void setComContext(String comContext) {
		this.comContext = comContext;
	}

	public Company(String comNo, String comName, String comAddress, String comPhone, String comContext) {
		super();
		this.comNo = comNo;
		this.comName = comName;
		this.comAddress = comAddress;
		this.comPhone = comPhone;
		this.comContext = comContext;
	}

	public Company() {
		super();
	}

	@Override
	public String toString() {
		return "Company [comNo=" + comNo + ", comName=" + comName + ", comAddress=" + comAddress + ", comPhone="
				+ comPhone + ", comContext=" + comContext + "]";
	}

}
