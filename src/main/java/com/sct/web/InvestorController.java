package com.sct.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sct.vo.InvestorVO;
/**
 * This is a SpringFramework implementation of REST
 * will be exposed as <code>/investors</code> context.
 * @author alviny
 *
 */
@RestController
public class InvestorController {
	@RequestMapping( "investors")
	public List<InvestorVO> getInvestors(){
		List<InvestorVO> investors = new ArrayList<InvestorVO>();
		investors.add(new InvestorVO("account1"));
		return investors;
	}
}
     