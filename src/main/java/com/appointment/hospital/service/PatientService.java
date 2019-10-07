package com.appointment.hospital.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.hospital.model.Patient;
import com.appointment.hospital.repository.PatientDao;


@Service("patientService")
public class PatientService {

	@Autowired
	PatientDao patientDao;

	@Transactional
	public Patient addPatient(Patient patient) {
		patientDao.save(patient);
		return patient;
	}

	public Patient getPatient(String id) {
		id = id.replace("\"", "");
		System.out.println("patient Id "+id);
		return patientDao.findOne(Integer.parseInt(id));
	}

}
