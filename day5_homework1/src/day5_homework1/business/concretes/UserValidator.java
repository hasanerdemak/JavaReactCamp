package day5_homework1.business.concretes;

import day5_homework1.entities.concretes.User;

public class UserValidator {

	public static boolean validateUser(User user) {
		boolean isValid = checkFirstName(user.getFirstName()) && checkLastName(user.getLastName())
				&& checkEmail(user.getEmail()) && checkPassword(user.getPassword());
		
		return isValid;
	}

	public static boolean checkFirstName(String firstName) {
		boolean isValid = firstName.length() >= 2;

		if(!isValid) {
			System.out.println("Invalid firstName");
		}
		return isValid;
	}

	public static boolean checkLastName(String lastName) {
		boolean isValid = lastName.length() >= 2;

		if(!isValid) {
			System.out.println("Invalid lastName");
		}
		return isValid;
	}

	public static boolean checkEmail(String email) {
		boolean isValid = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");

		if(!isValid) {
			System.out.println("Invalid email");
		}
		return isValid;
	}

	public static boolean checkPassword(String password) {
		boolean isValid = password.length() >= 6;

		if(!isValid) {
			System.out.println("Invalid password");
		}
		return isValid;
	}
}
