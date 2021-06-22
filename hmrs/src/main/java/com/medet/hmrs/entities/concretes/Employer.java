package com.medet.hmrs.entities.concretes;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.medet.hmrs.entities.abstracts.IEntity;

import lombok.Data;


@Entity

@Data
@Table(name ="employers")
public class Employer implements IEntity{
	
	@Id
	@GeneratedValue
	@Column(name = "employer_id")
	private  int employerId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_site")
	private String webSite;
	
	@Column(name = "phone_number")
	private String phoneNumber;

	@Autowired
	public Employer() {
		super();
	}

	@Autowired
	public Employer(int employerId, String companyName, String webSite, String phoneNumber) {
		super();
		this.employerId = employerId;
		this.companyName = companyName;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	

}
