package com.medet.hmrs.business.concres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medet.hmrs.business.abstracts.CandidatesService;
import com.medet.hmrs.business.abstracts.CandidatesVerificationService;
import com.medet.hmrs.dataAccess.abstracts.CandidatesVerificationDao;
import com.medet.hmrs.entities.concretes.CandidatesVerification;

@Service
public class CandidatesVerificationManager implements CandidatesVerificationService {

	private CandidatesVerificationDao candidatesVerificationDao;
	
	
	
	@Autowired
	public CandidatesVerificationManager(CandidatesVerificationDao candidatesVerificationDao) {
		super();
		this.candidatesVerificationDao = candidatesVerificationDao;
	}




	@Override
	public List<CandidatesVerification> getAll() {
		// TODO Auto-generated method stub
		return candidatesVerificationDao.findAll();
	}

}
