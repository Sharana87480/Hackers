package com.zohocrm2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.zohocrm2.Entity.Contact;
import com.zohocrm2.Entity.Lead;
import com.zohocrm2.Servicelayer.ContactService;
import com.zohocrm2.Servicelayer.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadservice;
	
	@Autowired
    private ContactService contactservice;
	
   @RequestMapping("/viewCreateLeadPage")
   public String viewcreateLeadPage()
   {
	return "create_lead";
	   
   }
   
   @RequestMapping("/saveLead")
   public String saveOneLead(@ModelAttribute("lead")Lead lead,ModelMap m) {
		
	   leadservice.saveOneLead(lead);
	   m.addAttribute("lead", lead);
	   return "lead_info";
	   
   }
   
   @RequestMapping("/composeEmail")
   public String composeEmail(@RequestParam("email")String email,ModelMap m)
   {
	  m.addAttribute("email", email); 
	  return "compose_email";
	   
   }
   
   @RequestMapping("/convertLead")
   public String convertLead(@RequestParam("id")long id)
   {
	   Lead lead = leadservice.getOneLead(id);
	   
	   Contact c = new Contact();
	       c.setFirstName(lead.getFirstName());
	       c.setLastName(lead.getLastName());
	       c.setEmail(lead.getEmail());
	       c.setMobile(lead.getMobile());
	       c.setSource(lead.getSource());
	       
	       contactservice.saveOneContact(c);
	       
	       leadservice.deleteOneLead(lead.getId());
	return "create_lead";
	   
   }
   
   @RequestMapping("/listAll")
   public String getAllLeads(ModelMap m)
   {
	List<Lead> leads = leadservice.listall();
	m.addAttribute("leads", leads);
	return "List_leads";
   }
   
   @RequestMapping("/findLeadById")
	public String findOneLead(@RequestParam("id")long id,ModelMap m)
	{
	   Lead lead = leadservice.getOneLead(id);
	   m.addAttribute("lead", lead);
	   return "lead_info";
		
	}
   
   @RequestMapping("/listContacts")
   public String getAllContacts(ModelMap m) 
   {
	   List<Contact> contacts = contactservice.listContact();
	   m.addAttribute("contact", contacts);
	return "Contact_lead";
	    
   }
   
   @RequestMapping("/findContactById")
   public String findOneContacts(@RequestParam("id")long id,ModelMap m)
   {
	   Contact contacts = contactservice.getOneContact(id);
	   m.addAttribute("contact", contacts);
	   return "contact_info";
	   
   }
   
  
   


  
   

}
