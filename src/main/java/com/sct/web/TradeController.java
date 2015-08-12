package com.sct.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sct.data.service.TradeDataService;
import com.sct.entity.Trade;
import com.sct.entity.TradeEntry;

@RestController
public class TradeController {
	@Autowired
	private TradeDataService tradeDataService;
	
	@RequestMapping( "trades")
	public List<Trade> getInvestors(){
		return tradeDataService.findAll();
	}
	@RequestMapping( "list")
	public List<TradeEntry> getList(){
		return tradeDataService.list();
	}
}
