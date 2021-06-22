package com.medet.hmrs.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.medet.hmrs.entities.abstracts.IEntity;

import lombok.Data;

@Data
@Entity
@Table(name = "candidates")
public class Candidates implements IEntity{

	@Id
	@GeneratedValue
	@Column(name = "candidates_id")
	private int candidateId;

	@Column(name = "name")
	private String name;

	@Column(name = "surName")
	private String surName;

	@Column(name = "national_id")
	private String nationalId;

	@Column(name = "birth_date")
	private Date birthDate;

	@Autowired
	public Candidates() {
		super();
	}
	@Autowired
	public Candidates(int candidateId, String name, String surName, String nationalId, Date birthDate) {
		super();
		this.candidateId = candidateId;
		this.name = name;
		this.surName = surName;
		this.nationalId = nationalId;
		this.birthDate = birthDate;
	}

}
