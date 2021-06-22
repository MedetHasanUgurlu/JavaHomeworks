package com.medet.hmrs.business.concres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medet.hmrs.business.abstracts.PersonnelConfirmEmployerService;
import com.medet.hmrs.dataAccess.abstracts.PersonnelConfirmEmployerDao;
import com.medet.hmrs.entities.concretes.PersonnelConfirmEmployer;

@Service
public class PersonnelConfirmEmployerManager implements PersonnelConfirmEmployerService {

	private PersonnelConfirmEmployerDao personnelConfirmEmployerDao;
	
	@Autowired
	public PersonnelConfirmEmployerManager(PersonnelConfirmEmployerDao personnelConfirmEmployerDao) {
		super();
		this.personnelConfirmEmployerDao = personnelConfirmEmployerDao;
	}


	@Override
	public List<PersonnelConfirmEmployer> getAll() {
		// TODO Auto-generated method stub
		return personnelConfirmEmployerDao.findAll();
	}
	
	
	


}
