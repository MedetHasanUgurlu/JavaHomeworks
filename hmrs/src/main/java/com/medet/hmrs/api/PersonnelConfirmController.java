package com.medet.hmrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medet.hmrs.business.abstracts.PersonnelConfirmService;
import com.medet.hmrs.entities.concretes.PersonnelConfirm;

@RestController
@RequestMapping("api/personnelconfirms")
public class PersonnelConfirmController {
	
	private PersonnelConfirmService personnelConfirmService;

	@Autowired
	public PersonnelConfirmController(PersonnelConfirmService personnelConfirmService) {
		super();
		this.personnelConfirmService = personnelConfirmService;
	}
	
	
	
	@RequestMapping("/getall")
	List<PersonnelConfirm> getAll(){
		
		
		return personnelConfirmService.getAll();
		}
	
	
	
	

}
