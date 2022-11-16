package com.zohocrm2.Servicelayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm2.Entity.Lead;
import com.zohocrm2.Repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveOneLead(Lead lead) {
		
		leadRepo.save(lead);
	}

	@Override
	public Lead getOneLead(long id) {
		
		Optional<Lead> findById = leadRepo.findById(id);
		return findById.get();
	}

	@Override
	public void deleteOneLead(long id) {
	
		leadRepo.deleteById(id);
		
	}

	@Override
	public List<Lead> listall() 
	{
	    List<Lead> leads = leadRepo.findAll();	
		return leads;
	}
	
	

}
