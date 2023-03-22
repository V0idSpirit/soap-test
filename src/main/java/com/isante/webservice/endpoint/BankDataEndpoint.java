package com.isante.webservice.endpoint;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.isante.webservice.model.BankData;
import com.isante.webservice.service.BankDataService;

import all.webservice.isante.com.AddBankingInfoRequest;
import all.webservice.isante.com.AddBankingInfoResponse;
import all.webservice.isante.com.BankingInfo;
import all.webservice.isante.com.GetBankingInfoByMemberId;
import all.webservice.isante.com.GetBankingInfoResponse;
import all.webservice.isante.com.ServiceStatus;
import all.webservice.isante.com.UpdateBankingInfoRequest;
import all.webservice.isante.com.UpdateBankingInfoResponse;

@Endpoint
public class BankDataEndpoint {

	private static final String NAMESPACE_URI = "http://com.isante.webservice.all";

	@Autowired
	private BankDataService bankDataService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addBankingInfoRequest")
	@ResponsePayload
	public AddBankingInfoResponse addBankingInfo(@RequestPayload AddBankingInfoRequest request) {

		AddBankingInfoResponse response = new AddBankingInfoResponse();
		ServiceStatus serviceStatus = new ServiceStatus();

		BankData bankData = new BankData();
		BeanUtils.copyProperties(request.getBankingInfo(), bankData);
		bankDataService.addBankData(bankData);
		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Content Added Successfully");
		response.setServiceStatus(serviceStatus);
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBankingInfoByMemberIdRequest")
	@ResponsePayload
	public GetBankingInfoResponse getBankingInfo(@RequestPayload GetBankingInfoByMemberId request) {

		GetBankingInfoResponse response = new GetBankingInfoResponse();
		BankingInfo bankingInfo = new BankingInfo();
		BeanUtils.copyProperties(bankDataService.getBankDataByMemberId(request.getMemberId()), bankingInfo);
		response.setBankingInfo(bankingInfo);
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateBankingInfoRequest")
	@ResponsePayload
	public UpdateBankingInfoResponse updateBankingInfo(@RequestPayload UpdateBankingInfoRequest request) {

		BankData bankData = new BankData();

		BeanUtils.copyProperties(request.getBankingInfo(), bankData);
		bankDataService.updateBankData(bankData);
		ServiceStatus serviceStatus = new ServiceStatus();
		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Content Added Successfully");
		UpdateBankingInfoResponse response = new UpdateBankingInfoResponse();
		response.setServiceStatus(serviceStatus);
		return response;
	}

}
