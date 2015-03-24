package com.sct.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sct.entity.Investor;

@Service("investorDataService")
@Transactional
public class InvestorDataService {
	@Autowired
	private InvestorDAO dao;
	
	public List<Investor> findAll(){
		return dao.findAll();
	}
}
