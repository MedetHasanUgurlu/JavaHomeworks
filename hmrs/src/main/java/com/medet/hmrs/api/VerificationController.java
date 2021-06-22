package com.medet.hmrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medet.hmrs.business.abstracts.VerificationService;
import com.medet.hmrs.entities.concretes.Verification;

@RestController
@RequestMapping("api/verifications")
public class VerificationController {

	private VerificationService verificationService;

	@Autowired
	public VerificationController(VerificationService verificationService) {
		super();
		this.verificationService = verificationService;
	}
	
	@RequestMapping("/getall")
	public List<Verification> getALL(){
		
		return verificationService.getAll();
		
	}
	
}
