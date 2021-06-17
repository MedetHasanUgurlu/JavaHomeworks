package Entities;

import Abstract.IEntity;

public class Customer implements IEntity {
	
	private int id;
	private String FirstName;
	private String LastName;
	private String NationalityID;
	
	
	public Customer(int id,String FirstName,String LastName,String NationalityID) {
	this.id = id;
	this.FirstName = FirstName;
	this.LastName = LastName;
	this.NationalityID = NationalityID;
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getNationalityID() {
		return NationalityID;
	}


	public void setNationalityID(String nationalityID) {
		NationalityID = nationalityID;
	}


	
	
	
	
	

}
