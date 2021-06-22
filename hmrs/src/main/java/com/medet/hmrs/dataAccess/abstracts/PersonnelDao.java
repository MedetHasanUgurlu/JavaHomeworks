package com.medet.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medet.hmrs.entities.concretes.Personnel;

public interface PersonnelDao extends JpaRepository<Personnel, Integer> {

}
