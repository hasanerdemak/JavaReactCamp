package day5_homework1.business.concretes;

import day5_homework1.business.abstracts.UserService;
import day5_homework1.core.abstracts.RegistrationService;
import day5_homework1.dataAccess.abstracts.UserDao;
import day5_homework1.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private RegistrationService registrationService;

	public UserManager(UserDao userDao, RegistrationService registrationService) {
		super();
		this.userDao = userDao;
		this.registrationService = registrationService;
	}

	@Override
	public void register(User user) {
		if (!UserValidator.validateUser(user)) {
			return;
		}
		
		var users = userDao.getAll();
		if (users != null) {
			if(userDao.getAll().contains(user)) {
				System.out.println("User already registered: " + user.getFirstName());
				return;
			}
			
			for (User tempUser : users) {
				if (tempUser.getEmail().equals(user.getEmail())) {
					System.out.println("This email has already been used: " + user.getEmail());
					return;
				}
			}
		}
		
		
		System.out.println("Verifaction code sent to : " + user.getEmail());
		System.out.println("Registired successfully");

		this.userDao.add(user);
		this.registrationService.register(user.getFirstName());
	}

	@Override
	public void login(User user) {
		if (!UserValidator.validateUser(user)) {
			return;
		}
		if ((userDao.getAll() == null) || (userDao.getAll() != null && !userDao.getAll().contains(user))) {
			System.out.println("There is no account with this info: " + user);
			return;
		}

		this.registrationService.login("User logged in: " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		if (!UserValidator.validateUser(user)) {
			return;
		}
		if ((userDao.getAll() == null) || (userDao.getAll() != null && !userDao.getAll().contains(user))) {
			System.out.println("There is no account with this info: " + user);
			return;
		}

		this.userDao.delete(user);
	}

}
