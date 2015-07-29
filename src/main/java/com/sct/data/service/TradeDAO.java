package com.sct.data.service;

import org.springframework.stereotype.Repository;

import com.sct.entity.Trade;
@Repository("tradeDAO")
public class TradeDAO extends AbstractDAO<Trade>{ 
	public TradeDAO() {
		clazz = Trade.class;
	}
}
