package com.medet.hmrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medet.hmrs.business.abstracts.CandidatesVerificationService;
import com.medet.hmrs.entities.concretes.CandidatesVerification;

@RestController
@RequestMapping("api/candidatesverifications")
public class CandidatesVerificationController {
	
	private CandidatesVerificationService candidatesVerificationService;

	@Autowired
	public CandidatesVerificationController(CandidatesVerificationService candidatesVerificationService) {
		super();
		this.candidatesVerificationService = candidatesVerificationService;
	}
	
	@RequestMapping("/getall")
	List<CandidatesVerification> getAll(){
		
		return candidatesVerificationService.getAll();
		
	}
	
	
	
	

}
