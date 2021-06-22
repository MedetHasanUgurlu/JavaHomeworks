package com.medet.hmrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medet.hmrs.business.abstracts.EmployerService;
import com.medet.hmrs.entities.concretes.Employer;

@RestController
@RequestMapping("api/employers")
public class EmployerController {
	
	private EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	@RequestMapping("/getall")
	public List<Employer> getAll(){
		return employerService.getAll();
		
		
		}
	
	
	
	
	

}
