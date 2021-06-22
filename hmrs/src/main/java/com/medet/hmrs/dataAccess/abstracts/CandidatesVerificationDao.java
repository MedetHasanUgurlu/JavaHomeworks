package com.medet.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medet.hmrs.entities.concretes.CandidatesVerification;

public interface CandidatesVerificationDao extends JpaRepository<CandidatesVerification, Integer> {

}
