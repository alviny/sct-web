package com.sct.data.service;


import org.springframework.stereotype.Repository;

import com.sct.entity.Investor;
@Repository("investorDAO")
public class InvestorDAO extends AbstractDAO<Investor>{
	public InvestorDAO() {
		clazz = Investor.class;
	}
}
