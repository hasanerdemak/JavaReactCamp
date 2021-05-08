package day3_homework2;

public class UserManager {
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giriş yaptı.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " çıkış yaptı.");
	}
	
	public void getInformation(User user) {
		System.out.println("Adı: " + user.getFirstName());
		System.out.println("Soyadı: " + user.getLastName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Kullanıcı adı: " + user.getUsername());
		System.out.println("Id: " + user.getId());
		System.out.println("----------");
	}
}