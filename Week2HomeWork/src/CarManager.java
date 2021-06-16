
public class CarManager {
	
	
	
	
	public void display(Car car) {
		System.out.println("Car id :"+ car.getId());
		System.out.println("Car name :"+ car.getName());
		
	}
	
	
	public void changeId(Car car,int ID) {
		
		
		
		car.setId(ID);
		
		
	}
	
	

}
