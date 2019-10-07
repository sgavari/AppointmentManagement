package com.appointment.hospital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appointment.hospital.model.Patient;

@Repository
public interface PatientDao extends CrudRepository<Patient, Integer> {
}
