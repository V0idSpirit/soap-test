package com.isante.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isante.webservice.model.BankData;
import com.isante.webservice.repository.BankDataRepository;

@Service
public class BankingInfoServiceImpl implements BankDataService {

	@Autowired
	BankDataRepository bankDataRepository;

	@Override
	public void addBankData(BankData bankData) {
		bankDataRepository.save(bankData);
	}

	@Override
	public BankData getBankDataByMemberId(long memberId) {
		BankData obj = bankDataRepository.findByMemberId(memberId);
		return obj;
	}

	@Override
	public void updateBankData(BankData bankData) {
		bankDataRepository.save(bankData);
	}

}
