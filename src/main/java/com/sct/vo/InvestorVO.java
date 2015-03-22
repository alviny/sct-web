package com.sct.vo;

public class InvestorVO {
	private String accountNumber;
	public InvestorVO() {
	}
	public InvestorVO(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
