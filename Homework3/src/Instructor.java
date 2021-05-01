
public class Instructor extends User {

	private int countOfStudents;
	
	
	public Instructor(int id, String firstName, String lastName, String trainingName) {
		super(id, firstName, lastName, trainingName);
		
	}


	public int getCountOfStudents() {
		return countOfStudents;
	}


	public void setCountOfStudents(int countOfStudents) {
		this.countOfStudents = countOfStudents;
	}
	
	
	
}
