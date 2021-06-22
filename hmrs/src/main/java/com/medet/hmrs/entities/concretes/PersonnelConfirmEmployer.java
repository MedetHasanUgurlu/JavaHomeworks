package com.medet.hmrs.entities.concretes;

import javax.persistence.*;

import com.medet.hmrs.entities.abstracts.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="personnelconfirmsemployers")

public class PersonnelConfirmEmployer implements IEntity{
	
	
	@Id
	@GeneratedValue
	@Column(name="confirm_id")
	private int personnelId;
	@Column(name="employer_id")

	private int employerId;
	

}
