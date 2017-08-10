package jhd.sign.service;

import org.apache.ibatis.session.SqlSession;

import jhd.config.MyBatisConfig;
import jhd.sign.entity.User;
import jhd.sign.mapper.UserMapper;

public class UserServiceImp implements UserService {
	
	
	

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		SqlSession openSession = MyBatisConfig.getFactoryInstance().openSession();
		UserMapper mapper = openSession.getMapper(UserMapper.class);
		
		User loginUser = new User();
		loginUser.setUsername(username);
		loginUser.setPassword(password);
		User authUser = mapper.findUserByUsernameAndPassword(loginUser);
		openSession.close();
		if (authUser != null) {
			return true;
		}
		return false;
	}

}
