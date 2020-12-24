package com.myclinic.doctor.registration.view;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Doctor {

	@Id
	private String doctorId;
	private String firstName;
	private String lastName;
	private String age;
	private Address address;
	private String registrationNumber;
	private String specialization;
	private List<Qualification> qualifications;
	private List<Clinic> clinics;
	
	
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public List<Qualification> getQualifications() {
		return qualifications;
	}
	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
	public List<Clinic> getClinics() {
		return clinics;
	}
	public void setClinics(List<Clinic> clinics) {
		this.clinics = clinics;
	}
	
	
}
