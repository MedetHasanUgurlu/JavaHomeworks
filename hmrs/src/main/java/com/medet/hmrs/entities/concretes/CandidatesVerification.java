package com.medet.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.medet.hmrs.entities.abstracts.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

@Data
@Entity
@Table(name="candidatesverifications")
public class CandidatesVerification implements IEntity{
	
	
	@Id
	@GeneratedValue
	@Column(name= "verification_id")
	private int verificatitonId;
	
	@Column(name= "candidates_id")
	private int candidatesId;
	
	
	

}
