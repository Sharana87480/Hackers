package com.zohocrm2.Servicelayer;

import java.util.List;

import com.zohocrm2.Entity.Lead;

public interface LeadService {

	void saveOneLead(Lead lead);

	Lead getOneLead(long id);

	void deleteOneLead(long id);

	List<Lead> listall();

}
