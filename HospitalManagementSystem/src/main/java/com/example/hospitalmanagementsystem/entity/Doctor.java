package com.example.hospitalmanagementsystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="doctor")
public class Doctor {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_Id")
    private int id;
    
    
    @Column(name = "first_name")
    @NotBlank(message = "First Name is required.")
    private String firstName;
    
    @Column(name = "last_name")
    @NotBlank(message = "Last Name is required.")
    private String lastName;
    
    @Email
    @Column(name = "email", nullable = false)
    @NotBlank(message = "Email is required.")
	private String email;
    
    @Column(name = "phone_number")
    @NotBlank(message = "Phone Number is required.")
	@Pattern(regexp="(^$|[0-9]{10})",message = "Invalid Number") 
    private String phoneNumber;
    
    @Column(name = "address", nullable = false)
    @NotBlank(message = "Address is required.")
    private String address;
    
    @Column(name = "username", nullable = false, unique = true)
    @NotBlank(message = "UserName is required.")
    private String username;
    
    @Column(name = "docpassword",unique = true)
    @NotBlank(message = "Password required.")
    private String password;
    
    @Column(name = "age")
    private int age;
    
    @Column(name = "gender")
    private String gender;
    
   
	public Doctor() {
		super();
	}


	public Doctor(int id, @NotBlank(message = "First Name is required.") String firstName,
			@NotBlank(message = "Last Name is required.") String lastName,
			@Email @NotBlank(message = "Email is required.") String email,
			@NotBlank(message = "Phone Number is required.") @Pattern(regexp = "(^$|[0-9]{10})", message = "Invalid Number") String phoneNumber,
			@NotBlank(message = "Address is required.") String address,
			@NotBlank(message = "UserName is required.") String username,
			@NotBlank(message = "Password required.") String password, int age, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.username = username;
		this.password = password;
		this.age = age;
		this.gender = gender;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Doctor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", username=" + username + ", password="
				+ password + ", age=" + age + ", gender=" + gender + "]";
	}

}

