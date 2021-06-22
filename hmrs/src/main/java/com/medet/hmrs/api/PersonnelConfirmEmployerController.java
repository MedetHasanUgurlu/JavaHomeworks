package com.medet.hmrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medet.hmrs.business.abstracts.PersonnelConfirmEmployerService;
import com.medet.hmrs.entities.concretes.PersonnelConfirmEmployer;

@RestController
@RequestMapping("api/personnelconfirmemployers")
public class PersonnelConfirmEmployerController {
	
	private PersonnelConfirmEmployerService personnelConfirmEmployerService;

	@Autowired
	public PersonnelConfirmEmployerController(PersonnelConfirmEmployerService personnelConfirmEmployerService) {
		super();
		this.personnelConfirmEmployerService = personnelConfirmEmployerService;
	}
	@RequestMapping("/getall")
	public List<PersonnelConfirmEmployer> getAll(){
		
		return personnelConfirmEmployerService.getAll();
		
	}
	
	
	

}
