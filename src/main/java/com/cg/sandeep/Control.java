package com.cg.sandeep;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.models.PatientInfo;

@RestController
public class Control {

	@RequestMapping(path="/baseMapping", method=RequestMethod.GET)
	public String baseUrlMapping() {
		return "WELCOME";
	}
	
	@RequestMapping(path="/getName", method=RequestMethod.GET)
	public String getName() {
		return "sandeep";
	}
	
	@RequestMapping(path="/storeName", method=RequestMethod.GET)
	public String storeName(@RequestParam("name") String name) {
		String str = "name";
		return str;
	}
	
	@RequestMapping(path="/savePatientInfo", method=RequestMethod.POST)
	public PatientInfo savePatientInfo(@RequestBody PatientInfo patient) {
		return patient;
	}
}
