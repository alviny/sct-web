package com.sct.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sct.data.service.InvestorDataService;
import com.sct.data.service.TradeDataService;
import com.sct.entity.Investor;
import com.sct.entity.Trade;

@RestController
public class TradeController {
	@Autowired
	private TradeDataService tradeDataService;
	
	@RequestMapping( "trades")
	public List<Trade> getInvestors(){
		return tradeDataService.findAll();
	}
}
