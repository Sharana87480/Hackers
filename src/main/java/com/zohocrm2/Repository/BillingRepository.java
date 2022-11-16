package com.zohocrm2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm2.Entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
