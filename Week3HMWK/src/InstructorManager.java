
public class InstructorManager  extends UserManager{

	Instructor instructor;
	public InstructorManager(Instructor instructor) {
	
		
		// TODO Auto-generated constructor stub
		this.instructor = instructor;
	}
	
	public void deleteAccount() {
		System.out.println("Deleting process will launch");
		
		
	}

	@Override
	public void Log() {
		System.out.println(instructor.getName()+" is logged.");
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
		super.Save();
	}
	

}
