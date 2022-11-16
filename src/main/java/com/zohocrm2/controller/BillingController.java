package com.zohocrm2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm2.Entity.Billing;
import com.zohocrm2.Entity.Contact;
import com.zohocrm2.Servicelayer.BillingService;
import com.zohocrm2.Servicelayer.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactservice;
	
	@Autowired
	private BillingService billservice;

	@RequestMapping("/generateBill")
	public String getContactId(@RequestParam("id") long id,ModelMap m )
	{
		Contact contact = contactservice.getOneContact(id);
		m.addAttribute("c",contact );
		return "Generate_Bill";
		
	}
	
	@RequestMapping("/saveBill")
	public String Billingdetails(@ModelAttribute("bill")Billing Bill)
	{
		billservice.saveBill(Bill);
		return "Generate_Bill";
		
	}
	
	@RequestMapping("ListBills")
	public String getBills(ModelMap m)
	{
		List<Billing> Bills = billservice.getBillLeads();
		m.addAttribute("Bills", Bills);
		return "Bill_list";
	}
}
