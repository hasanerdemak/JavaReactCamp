package day5_homework1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5_homework1.dataAccess.abstracts.UserDao;
import day5_homework1.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("User added with Hibernate: " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("User updated with Hibernate: " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("User deleted with Hibernate: " + user.getFirstName());
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
