package com.medet.hmrs.entities.concretes;

import java.util.Date;

import javax.persistence.*;

import com.medet.hmrs.entities.abstracts.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="personnelconfirms")
public class PersonnelConfirm implements IEntity{

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "personal_id")
	private String personalId;
	
	@Column(name = "isConfirmed")
	private boolean isConfirmed;
	
	@Column(name = "confirmDate")
	private Date confirmDate;
	
	
}
