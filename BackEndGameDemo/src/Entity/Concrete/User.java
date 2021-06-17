package Entity.Concrete;

import Entity.Abstract.IEntity;

public class User extends IEntity{
	private  int id ;
    private  String firstName;
    private String lastName;
    private String password;
    private int nationalNumber;
    private int birthYear;
     
    public User(int id, String firstName, String lastName, String password, int nationalNumber, int birthYear,
			String identificationNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.nationalNumber = nationalNumber;
		this.birthYear = birthYear;
		this.identificationNumber = identificationNumber;
	}
	private  String identificationNumber;
	public User(int id, String firstName, String lastName, String password, String identificationNumber) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.identificationNumber = identificationNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNationalNumber() {
		return nationalNumber;
	}
	public void setNationalNumber(int nationalNumber) {
		this.nationalNumber = nationalNumber;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
    
    
    

}
