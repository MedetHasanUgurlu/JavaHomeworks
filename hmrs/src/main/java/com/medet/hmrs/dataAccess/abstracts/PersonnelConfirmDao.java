package com.medet.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medet.hmrs.entities.concretes.PersonnelConfirm;

public interface PersonnelConfirmDao extends JpaRepository<PersonnelConfirm, Integer> {

}
