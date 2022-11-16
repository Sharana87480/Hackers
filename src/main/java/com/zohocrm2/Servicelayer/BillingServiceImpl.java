package com.zohocrm2.Servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm2.Entity.Billing;
import com.zohocrm2.Repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billRepo;

	@Override
	public void saveBill(Billing bill)
	{
	  billRepo.save(bill);	
		
	}

	@Override
	public List<Billing> getBillLeads() 
	{
		List<Billing> findAll = billRepo.findAll();
		return findAll;
	}

}
