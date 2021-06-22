package com.medet.hmrs.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.medet.hmrs.entities.abstracts.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="verifications")

public class Verification implements IEntity {
	
	
	
	
	@Id
	@GeneratedValue
	@Column(name= "id")
	private int id;
	
	@Column(name= "verification_code")
	private String verificationCode;
	
	@Column(name= "isVerrfied")
	private boolean isVerrified;
	
	@Column(name= "verrifiedDate")
	private Date verrifiedDate;

}
