package com.sct.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sct.entity.Trade;
import com.sct.entity.TradeEntry;

@Service("tradeDataService")
@Transactional
public class TradeDataService {
	@Autowired
	private TradeDAO dao;
	
	@Autowired
	private TradeEntryDAO entryDao;
	
	public List<Trade> findAll(){
		return dao.findAll();
	}
	public List<TradeEntry> list(){
		return entryDao.findAll();
	}
}
