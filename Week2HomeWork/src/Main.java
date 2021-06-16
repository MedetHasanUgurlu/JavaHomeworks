
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car(1, "Volvo");
		Car car2 = new Car(2, "Mercedes");
		Car car3 = new Car(3, "Tesla");
		
		CarManager carManager = new  CarManager();
		
		carManager.changeId(car3, 25);
		carManager.display(car3);
		

	}

}
