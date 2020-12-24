package com.myclinic.doctor.registration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myclinic.doctor.registration.view.Doctor;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
	
}
