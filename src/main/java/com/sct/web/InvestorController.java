package com.sct.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sct.data.service.InvestorDataService;
import com.sct.entity.Investor;
/**
 * This is a SpringFramework implementation of REST
 * will be exposed as <code>/investors</code> context.
 * @author alviny
 *
 */
@RestController
public class InvestorController {
	@Autowired
	private InvestorDataService investorDataService;
	
	@RequestMapping( "investors")
	public List<Investor> getInvestors(){
		return investorDataService.findAll();
	}
}
     