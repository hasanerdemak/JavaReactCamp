package day3_homework2;

public class UserManager {
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giri� yapt�.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ��k�� yapt�.");
	}
	
	public void getInformation(User user) {
		System.out.println("Ad�: " + user.getFirstName());
		System.out.println("Soyad�: " + user.getLastName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Kullan�c� ad�: " + user.getUsername());
		System.out.println("Id: " + user.getId());
		System.out.println("----------");
	}
}