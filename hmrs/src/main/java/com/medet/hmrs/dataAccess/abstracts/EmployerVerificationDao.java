package com.medet.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medet.hmrs.entities.concretes.EmployerVerification;

public interface EmployerVerificationDao extends JpaRepository<EmployerVerification, Integer> {

}
