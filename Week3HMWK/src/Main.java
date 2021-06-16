
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instructor instructor = new Instructor(125, 25, "Medet Ugurlu");
		
		InstructorManager maanger = new InstructorManager(instructor);
		maanger.Log();
		
		
		
		Student student = new Student(76, "Engin Demirog", 974);
		student.Logging();

	}

}
