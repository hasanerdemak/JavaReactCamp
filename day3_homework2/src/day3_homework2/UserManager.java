package day3_homework2;

public class UserManager {
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giriþ yaptý.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " çýkýþ yaptý.");
	}
	
	public void getInformation(User user) {
		System.out.println("Adý: " + user.getFirstName());
		System.out.println("Soyadý: " + user.getLastName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Kullanýcý adý: " + user.getUsername());
		System.out.println("Id: " + user.getId());
		System.out.println("----------");
	}
}