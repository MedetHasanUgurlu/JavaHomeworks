
public class Instructor extends User{
	
	private int securityNumber;
	
	
	public Instructor(int securityNumber,int id,String name){
		super(id,name);
	
		
		this.securityNumber = securityNumber;
		
		
	}

	public int getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(int securityNumber) {
		this.securityNumber = securityNumber;
	}

	
	
	
	
	

}
