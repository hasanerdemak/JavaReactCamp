package day5_homework1.dataAccess.abstracts;

import java.util.List;

import day5_homework1.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
}
