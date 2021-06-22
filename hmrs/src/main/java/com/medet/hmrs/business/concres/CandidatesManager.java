package com.medet.hmrs.business.concres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medet.hmrs.business.abstracts.CandidatesService;
import com.medet.hmrs.dataAccess.abstracts.CandidatesDao;
import com.medet.hmrs.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao; 
	
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}



	@Override
	public List<Candidates> getAll() {
		// TODO Auto-generated method stub
		return candidatesDao.findAll();
	}

}
