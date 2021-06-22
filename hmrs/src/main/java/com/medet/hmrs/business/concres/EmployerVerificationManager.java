package com.medet.hmrs.business.concres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medet.hmrs.business.abstracts.EmployerVerificationService;
import com.medet.hmrs.dataAccess.abstracts.EmployerVerificationDao;
import com.medet.hmrs.entities.concretes.EmployerVerification;

@Service
public class EmployerVerificationManager implements EmployerVerificationService{

	private EmployerVerificationDao employerVerificationDao;
	
	
	@Autowired
	public EmployerVerificationManager(EmployerVerificationDao employerVerificationDao) {
		super();
		this.employerVerificationDao = employerVerificationDao;
	}



	@Override
	public List<EmployerVerification> getAll() {
		// TODO Auto-generated method stub
		return employerVerificationDao.findAll();
	}

	
	
}
