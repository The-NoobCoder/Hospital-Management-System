package com.example.hospitalmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "receptionist")
public class Receptionist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "receptionistId")
	private int id;
	
	@Column(name="recepFirstName")
	@NotBlank(message = "Firstname must be required")
	private String firstName;
	
	@Column(name="recepLastName")
	@NotBlank(message = "Firstname must be required")
	private String lastName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "age")
    private int age;
	
	@Column(name = "address")
	private String address;
	
	@Column(name="pincode")
	private String pinCode;
	
	@Column(name = "city")
	private String city;
	
	@Email
	@Column(name = "Email")
	private String email;
	
	@Column(name = "userName", nullable = false, unique = true)
    @NotBlank(message = "UserName is required.")
    private String userName;
    
    @Column(name = "password", nullable = false, unique = true)
    @NotBlank(message = "Password required.")
    private String password;
	
	@NotBlank(message = "Phone number must be required.")
	@Pattern(regexp="(^$|[0-9]{10})",message = "Invalid Number") 
	@Column(name="phoneNo")
	private String phoneNo;
	
	

	public Receptionist() {
		super();
	}

	public Receptionist(int id, @NotBlank(message = "Firstname must be required") String firstName,
			@NotBlank(message = "Firstname must be required") String lastName, String gender, int age, String address,
			String pinCode, String city, @Email String email,
			@NotBlank(message = "UserName is required.") String userName,
			@NotBlank(message = "Password required.") String password,
			@NotBlank(message = "Phone number must be required.") @Pattern(regexp = "(^$|[0-9]{10})", message = "Invalid Number") String phoneNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.pinCode = pinCode;
		this.city = city;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.phoneNo = phoneNo;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Receptionist [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + ", address=" + address + ", pinCode=" + pinCode + ", city=" + city + ", email="
				+ email + ", userName=" + userName + ", password=" + password + ", phoneNo=" + phoneNo + "]";
	}
		
}
