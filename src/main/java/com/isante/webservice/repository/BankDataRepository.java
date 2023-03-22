package com.isante.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isante.webservice.model.BankData;


public interface BankDataRepository extends JpaRepository<BankData, Long> {
	BankData findByMemberId(long memberId);
}
