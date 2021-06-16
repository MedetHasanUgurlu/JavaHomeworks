
public class Student extends User{

	

	private int studentNumber;
	public Student(int id, String name,int studentNumber) {
		super(id, name);
		// TODO Auto-generated constructor stub
		this.studentNumber = studentNumber;
	}
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	

}
