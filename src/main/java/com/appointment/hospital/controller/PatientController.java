package com.appointment.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.hospital.model.Patient;
import com.appointment.hospital.model.Response;
import com.appointment.hospital.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService patientService;


	@RequestMapping(value = "/addPatient", method = RequestMethod.POST, headers = "Accept=application/json")
	public Patient addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}
	
	@PostMapping("/getPatient")
	public Response getPatientDetails(@RequestBody String id){
		Patient patient =  patientService.getPatient(id);
		Response response = new Response();
		response.setData(patient);
		response.setMessage(patient == null ? "No data found with tetetet given patient id ": "success");
		return response;
	}

}
