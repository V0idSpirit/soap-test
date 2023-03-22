package com.isante.webservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "banking_info")
public class BankData {
	@Id
	@Column(name = "member_id")
	private long memberId;

	@Column(name = "bank_name")
	private String bankName;

	@Column(name = "rib")
	private long rib;

	@Column(name = "currency")
	private String currency;

	@Column(name = "agency")
	private String agency;

	@Column(name = "window_number")
	private Integer windowNo;

	@Column(name = "rib_key")
	private Integer key;

	@Column(name = "rib_type")
	private String ribType;

	@Column(name = "account_number")
	private Integer account;

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public Integer getWindowNo() {
		return windowNo;
	}

	public void setWindowNo(Integer windowNo) {
		this.windowNo = windowNo;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getRibType() {
		return ribType;
	}

	public void setRibType(String ribType) {
		this.ribType = ribType;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public long getRib() {
		return rib;
	}

	public void setRib(long rib) {
		this.rib = rib;
	}

}
