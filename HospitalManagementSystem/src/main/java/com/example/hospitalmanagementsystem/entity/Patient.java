package com.example.hospitalmanagementsystem.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="patientdetails")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name="first_name")
	@NotBlank(message = "Firstname must be required")
	private String firstName;
	
	@Column(name="last_name")
	@NotBlank(message = "Lastname must be required")
	private String lastName;
	
	private String gender;
	
	private String address;
	
	@Column(name="pincode")
	private String pinCode;
	
	private String city;
	
	@Email
	private String email;
	
	@NotBlank(message = "Phone number must be required.")
	@Pattern(regexp="(^$|[0-9]{10})",message = "Invalid Number") 
	@Column(name="phone_no")
	private String phoneNo;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="health_Status")
	private String healthStatus;
	
	public Patient() {
		super();
	}


	public Patient(int id, @NotBlank(message = "Firstname must be required") String firstName,
			@NotBlank(message = "Lastname must be required") String lastName, String gender, String address,
			String pinCode, String city, @Email String email,
			@NotBlank(message = "Phone number must be required.") @Pattern(regexp = "(^$|[0-9]{10})", message = "Invalid Number") String phoneNo,
			String bloodGroup, String healthStatus) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.pinCode = pinCode;
		this.city = city;
		this.email = email;
		this.phoneNo = phoneNo;
		this.bloodGroup = bloodGroup;
		this.healthStatus = healthStatus;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public String getHealthStatus() {
		return healthStatus;
	}


	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", address=" + address + ", pinCode=" + pinCode + ", city=" + city + ", email=" + email + ", phoneNo="
				+ phoneNo + ", bloodGroup=" + bloodGroup + ", healthStatus=" + healthStatus + "]";
	}





	
}

