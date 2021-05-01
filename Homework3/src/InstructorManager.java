
public class InstructorManager extends UserManager{

	public void courseGiven(User user) {
		System.out.println(user.getFirstName()+ user.getLastName() + "adli Egitmen" + user.getTrainingName() + "basariyla atandi");
	}
}
