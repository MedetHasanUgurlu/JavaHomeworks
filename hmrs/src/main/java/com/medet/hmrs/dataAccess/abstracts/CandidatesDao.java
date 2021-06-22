package com.medet.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medet.hmrs.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates, Integer> {

}
