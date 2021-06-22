package com.medet.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medet.hmrs.entities.concretes.Verification;

public interface VerificationDao extends JpaRepository<Verification, Integer> {

}
