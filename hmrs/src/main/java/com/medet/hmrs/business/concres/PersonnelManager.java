package com.medet.hmrs.business.concres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medet.hmrs.business.abstracts.PersonnelService;
import com.medet.hmrs.dataAccess.abstracts.PersonnelDao;
import com.medet.hmrs.entities.concretes.Personnel;

@Service
public class PersonnelManager implements PersonnelService {

	private PersonnelDao personnelDao;

	@Autowired
	public PersonnelManager(PersonnelDao personnelDao) {
		super();
		this.personnelDao = personnelDao;
	}

	@Override
	public List<Personnel> getAll() {
		// TODO Auto-generated method stub
		return personnelDao.findAll();
	}

}
