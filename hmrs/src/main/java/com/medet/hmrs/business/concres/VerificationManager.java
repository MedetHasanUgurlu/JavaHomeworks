package com.medet.hmrs.business.concres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medet.hmrs.business.abstracts.VerificationService;
import com.medet.hmrs.dataAccess.abstracts.VerificationDao;
import com.medet.hmrs.entities.concretes.Verification;
@Service

public class VerificationManager implements VerificationService {
	
	private VerificationDao verificationDao;
	

	@Autowired
	public VerificationManager(VerificationDao verificationDao) {
		super();
		this.verificationDao = verificationDao;
	}


	@Override
	public List<Verification> getAll() {
		// TODO Auto-generated method stub
		return verificationDao.findAll();
	}

}
