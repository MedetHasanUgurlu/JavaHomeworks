package com.medet.hmrs.business.concres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medet.hmrs.business.abstracts.PersonnelConfirmService;
import com.medet.hmrs.dataAccess.abstracts.PersonnelConfirmDao;
import com.medet.hmrs.entities.concretes.PersonnelConfirm;
@Service
public class PersonnelConfirmManager  implements PersonnelConfirmService{

	
	private PersonnelConfirmDao personnelConfirmDao;
	@Autowired
	public PersonnelConfirmManager(PersonnelConfirmDao personnelConfirmDao) {
		super();
		this.personnelConfirmDao = personnelConfirmDao;
	}

	@Override
	public List<PersonnelConfirm> getAll() {
		// TODO Auto-generated method stub
		return personnelConfirmDao.findAll();
	}
	
	
	

}
