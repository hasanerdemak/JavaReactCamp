package day5_homework1;

import java.util.ArrayList;

import day5_homework1.business.abstracts.UserService;
import day5_homework1.business.concretes.UserManager;
import day5_homework1.core.concretes.JGoogleSignInManagerAdapter;
import day5_homework1.dataAccess.concretes.HibernateUserDao;
import day5_homework1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		var userDao =  new HibernateUserDao();
		var registrationService = new JGoogleSignInManagerAdapter();
		UserService userService = new UserManager(userDao, registrationService);
		
		
		// REGISTER
		
		ArrayList<User> users = new ArrayList<User>();
		
		User user1 = new User(1,"Hasan","Ak","hasanak@gmail.com","hasan1234");
		
		users.add(user1);
		users.add(user1); // error: registered user
		users.add(new User(2,"Hasan","Ak","hasanak@gmail.com","hasan1234")); // error: previously used email
		users.add(new User(3,"H","Ak","hasanak3@gmail.com","hasan1234")); // error: invalid first name 
		users.add(new User(4,"Hasan","A","hasanak4@gmail.com","hasan1234")); // error: invalid last name
		users.add(new User(5,"Erdem","Ak","erdemak@gmail.com","h234")); // error: invalid password
		users.add(new User(6,"Hasan","Ak","hasanakgmail.com","hasan1234")); // error: invalid email
		users.add(new User(7,"Deniz","abc","denizabc@gmail.com","deniz1234"));

		for (User user : users) {
			userService.register(user);	
			System.out.println("-------------------------------------");
		}
		
		userDao.getAll().forEach(user -> System.out.println(user));
		
		System.out.println();
		
		// LOGIN
		
		userService.login(user1);
		userService.login(new User(8,"abc","abc","abcabc@gmail.com","abc1234")); // error: user has no account

	}

}
