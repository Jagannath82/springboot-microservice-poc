package com.myclinic.doctor.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myclinic.doctor.registration.manager.DoctorRegistrationManager;
import com.myclinic.doctor.registration.view.Doctor;

@RestController
public class DoctorRegistrationController {

	
	DoctorRegistrationManager doctorRegistrationManager;
	
	@Autowired
	public void setDoctorRegistrationManager(DoctorRegistrationManager doctorRegistrationManager) {
		this.doctorRegistrationManager = doctorRegistrationManager;
	}

	@PostMapping("/post")
	@CrossOrigin(origins = "*" , allowedHeaders = "*")
	public Doctor createDoctorRegistration(@RequestBody Doctor doctor) {
		return doctorRegistrationManager.createDoctorRegistration(doctor);
	}
	
	@GetMapping("/get")
	@CrossOrigin(origins = "*" , allowedHeaders = "*")
	public List<Doctor> getDoctorRegistration() {
		return doctorRegistrationManager.getDoctorRegistration();
	}
}
