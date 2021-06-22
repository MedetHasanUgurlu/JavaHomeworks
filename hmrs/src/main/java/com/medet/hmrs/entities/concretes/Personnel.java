package com.medet.hmrs.entities.concretes;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.medet.hmrs.entities.abstracts.IEntity;

import lombok.*;


@Data
@Table(name ="personnels")
@Entity
public class Personnel implements IEntity  {
	
	@Id
	@GeneratedValue
	@Column(name ="personnel_id")
	private int personnelId;
	
	@Column(name ="name")
	private String FirstName;
	
	@Column(name ="surname")
	private String LastName;
	
	@Autowired
	public Personnel() {
		super();
	}
	@Autowired
	public Personnel(int personnelId, String firstName, String lastName) {
		super();
		this.personnelId = personnelId;
		FirstName = firstName;
		LastName = lastName;
	}
	


	

	
	
}
	
