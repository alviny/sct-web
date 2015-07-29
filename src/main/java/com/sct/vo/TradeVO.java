package com.sct.vo;

import java.util.Date;

public class TradeVO {
	private Date tradeDate;
	private String symbol;
	private double price;
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
