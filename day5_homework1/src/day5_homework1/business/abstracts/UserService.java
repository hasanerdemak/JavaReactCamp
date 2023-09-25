package day5_homework1.business.abstracts;

import day5_homework1.entities.concretes.User;

public interface UserService {
	void register(User user);

	void login(User user);

	void delete(User user);
}
