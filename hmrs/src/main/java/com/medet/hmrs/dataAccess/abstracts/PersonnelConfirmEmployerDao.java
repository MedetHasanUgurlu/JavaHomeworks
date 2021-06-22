package com.medet.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medet.hmrs.entities.concretes.PersonnelConfirmEmployer;

public interface PersonnelConfirmEmployerDao  extends JpaRepository<PersonnelConfirmEmployer, Integer>{

}
