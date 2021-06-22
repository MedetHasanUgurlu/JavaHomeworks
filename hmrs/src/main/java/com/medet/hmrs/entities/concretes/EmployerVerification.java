package com.medet.hmrs.entities.concretes;

import javax.persistence.*;



import com.medet.hmrs.entities.abstracts.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name ="employerverifications")
public class EmployerVerification implements IEntity {

	
	@Id
	@GeneratedValue
	@Column(name ="verfication_id")
	private int verificationId;
	
	
	@Column(name ="employer_id")
	private int employerId;
	
	
	
	
	
}
