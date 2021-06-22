package com.medet.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medet.hmrs.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
