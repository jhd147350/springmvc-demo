package jhd.dao;

import jhd.entity.User;

public class UserDao {

	public User getUserById() {
		User user = new User();
		user.setUsername("jhd");
		user.setPassword("123456");
		return user;
	}
}
