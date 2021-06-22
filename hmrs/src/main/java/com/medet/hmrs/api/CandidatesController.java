package com.medet.hmrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medet.hmrs.business.abstracts.CandidatesService;
import com.medet.hmrs.entities.concretes.Candidates;

@RestController
@RequestMapping("api/candidates")
public class CandidatesController {
	
	private CandidatesService candidatesService;

	@Autowired
	public CandidatesController(CandidatesService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
	
	@RequestMapping("/getall")
	public List<Candidates> getAll(){
		return candidatesService.getAll();
		
		
	}
	
	

}
