package com.example.hospitalmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="appointment_id")
	private Integer appointmentId;
	
	@DateTimeFormat
	@Column(name="appointment_date")
	private String date;
	
	@Column(name="confirmed")
	private String confirmed;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
  @ManyToOne
	private Patient patient;
	
  @Column(name="doctor_name")  
     private String doctorName;

	public Appointment() {
		super();
	}

	public Appointment(Integer appointmentId, String date, String confirmed, String firstName, String lastName,
			Patient patient, String doctorName) {
		super();
		this.appointmentId = appointmentId;
		this.date = date;
		this.confirmed = confirmed;
		this.firstName = firstName;
		this.lastName = lastName;
		this.patient = patient;
		this.doctorName = doctorName;
	}

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", date=" + date + ", confirmed=" + confirmed
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", patient=" + patient + ", doctorName="
				+ doctorName + "]";
	}

	

	

	
	
	

}
