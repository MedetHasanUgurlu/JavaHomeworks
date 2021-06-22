package com.medet.hmrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medet.hmrs.business.abstracts.EmployerVerificationService;
import com.medet.hmrs.entities.concretes.EmployerVerification;

@RestController
@RequestMapping("api/employerverifications")
public class EmployerVerificationController {
	
	private EmployerVerificationService employerVerificationService;

	@Autowired
	public EmployerVerificationController(EmployerVerificationService employerVerificationService) {
		super();
		this.employerVerificationService = employerVerificationService;
	}
	
	@RequestMapping("/getall")
	List<EmployerVerification> getAll(){
		
		return employerVerificationService.getAll();
	}
	
	

}
