

public class Main {

	public static void main(String[] args) {
	
		// instructor yarat
		Instructor instructor= new Instructor(1, "Engin", "Demirog", "Java");
		
		UserManager userManager= new UserManager();
		userManager.add(instructor);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.courseGiven(instructor);
		
		Student student= new Student(1, "Lara", "Cevik", "Java");
		userManager.add(student);
		student.setTakenCourseName("Java");
		
		StudentManager studentManager= new StudentManager();
		studentManager.notes(student, student);
		
		
		
		
		// student yarat
	}

}
