package com.isante.webservice.service;

import com.isante.webservice.model.BankData;

public interface BankDataService {

	void addBankData(BankData bankData);

	BankData getBankDataByMemberId(long memberId);

	void updateBankData(BankData bankData);
}
