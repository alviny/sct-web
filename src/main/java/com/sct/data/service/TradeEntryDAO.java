package com.sct.data.service;

import org.springframework.stereotype.Repository;

import com.sct.entity.TradeEntry;
@Repository("tradeEntryDAO")
public class TradeEntryDAO extends AbstractDAO<TradeEntry>{
	public TradeEntryDAO() {
		clazz = TradeEntry.class;
	}
}
