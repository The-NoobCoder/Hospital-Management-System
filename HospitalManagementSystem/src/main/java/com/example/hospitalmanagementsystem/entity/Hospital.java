package com.example.hospitalmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="hospital")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="hos_id")
	private int hosId;
	
	@Column(name="hos_name")
	private String hosName;
	
	@Column(name="hos_city")
	private String hosCity;
	
	@Column(name="hos_add")
	private String hosAddress;
	
	@NotBlank(message = "Phone number must be required.")
	@Pattern(regexp="(^$|[0-9]{10})",message = "Invalid Number") 
	@Column(name="phone_no")
	private String phoneNo;

	public Hospital() {
		super();
	}

	public Hospital(int hosId, String hosName, String hosCity, String hosAddress,
			@NotBlank(message = "Phone number must be required.") @Pattern(regexp = "(^$|[0-9]{10})", message = "Invalid Number") String phoneNo) {
		super();
		this.hosId = hosId;
		this.hosName = hosName;
		this.hosCity = hosCity;
		this.hosAddress = hosAddress;
		this.phoneNo = phoneNo;
	}

	public int getHosId() {
		return hosId;
	}

	public void setHosId(int hosId) {
		this.hosId = hosId;
	}

	public String getHosName() {
		return hosName;
	}

	public void setHosName(String hosName) {
		this.hosName = hosName;
	}

	public String getHosCity() {
		return hosCity;
	}

	public void setHosCity(String hosCity) {
		this.hosCity = hosCity;
	}

	public String getHosAddress() {
		return hosAddress;
	}

	public void setHosAddress(String hosAddress) {
		this.hosAddress = hosAddress;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Hospital [hosId=" + hosId + ", hosName=" + hosName + ", hosCity=" + hosCity + ", hosAddress="
				+ hosAddress + ", phoneNo=" + phoneNo + "]";
	}

	
	

}
