package jhd.service;

import jhd.dao.UserDao;
import jhd.entity.User;

public class UserService {

	UserDao userDao=new UserDao();
	
	public User getUserById() {
		
	
		return userDao.getUserById();
		
	}
}
