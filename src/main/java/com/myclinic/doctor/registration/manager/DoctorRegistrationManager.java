package com.myclinic.doctor.registration.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myclinic.doctor.registration.repository.DoctorRepository;
import com.myclinic.doctor.registration.view.Doctor;

@Service
public class DoctorRegistrationManager {
	DoctorRepository doctorRepository;
	
	@Autowired
	public void setDoctorRepository(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}


	public Doctor createDoctorRegistration(Doctor doctor) {
		this.doctorRepository.save(doctor);
		return doctor;
	}
	
	public List<Doctor> getDoctorRegistration() {
		return this.doctorRepository.findAll();
	}

}
