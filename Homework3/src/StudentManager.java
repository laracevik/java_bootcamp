
public class StudentManager extends UserManager{

	public void notes(Student student, User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName()+ " "+ student.getTakenCourseName() + " adli kursu tamamlamistir." );
	}
}
