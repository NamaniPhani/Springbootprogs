package com.transaction.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance")
public class HealthInsurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="insurance_id")
	private int insuranceId;
	
	
	@Column(name="insurance_name",unique = true)
	private String insuranceName;
	

	@Column(name="premium")
	private int premium;


	public int getInsuranceId() {
		return insuranceId;
	}


	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}


	public String getInsuranceName() {
		return insuranceName;
	}


	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}


	public int getPremium() {
		return premium;
	}


	public void setPremium(int premium) {
		this.premium = premium;
	}


	@Override
	public String toString() {
		return "HealthInsurance [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", premium="
				+ premium + "]";
	}
	
	
	
}
