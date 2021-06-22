package com.medet.hmrs.business.concres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medet.hmrs.business.abstracts.EmployerService;
import com.medet.hmrs.dataAccess.abstracts.EmployerDao;
import com.medet.hmrs.entities.concretes.Employer;



@Service
public class EmployerManager implements EmployerService{
	
	
	private EmployerDao employerDao;
	

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}


	@Override
	public List<Employer> getAll() {
		// TODO Auto-generated method stub
		return employerDao.findAll();
	}


	

}
