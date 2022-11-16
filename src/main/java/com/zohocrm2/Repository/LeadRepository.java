package com.zohocrm2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm2.Entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
