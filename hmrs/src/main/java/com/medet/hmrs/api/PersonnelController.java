package com.medet.hmrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medet.hmrs.business.abstracts.PersonnelService;
import com.medet.hmrs.entities.concretes.Personnel;

@RestController
@RequestMapping("api/personnels")
public class PersonnelController {
	
	
	private PersonnelService personnelService;

	@Autowired
	public PersonnelController(PersonnelService personnelService) {
		super();
		this.personnelService = personnelService;
	}
	
	@RequestMapping("/getall")
	public List<Personnel> getAll(){
		
		return personnelService.getAll();
	}
	
	
	
	
	
	

}
