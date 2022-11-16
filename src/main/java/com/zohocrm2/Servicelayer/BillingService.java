package com.zohocrm2.Servicelayer;

import java.util.List;

import com.zohocrm2.Entity.Billing;

public interface BillingService {

	void saveBill(Billing bill);

	List<Billing> getBillLeads();

}
