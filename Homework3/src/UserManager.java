
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " kaydedildi.");
	}
	
	public void remove (User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " silindi.");
	}
	
	public void update (User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " güncellendi.");
	}
	
}
