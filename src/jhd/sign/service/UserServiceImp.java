package jhd.sign.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jhd.config.MyBatisConfig;
import jhd.sign.entity.User;
import jhd.sign.mapper.UserMapper;

@Service("userService")
public class UserServiceImp implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		/*SqlSession openSession = MyBatisConfig.getFactoryInstance().openSession();
		UserMapper mapper = openSession.getMapper(UserMapper.class);

		User loginUser = new User();
		loginUser.setUsername(username);
		loginUser.setPassword(password);
		User authUser = mapper.findUserByUsernameAndPassword(loginUser);
		openSession.close();
		if (authUser != null) {
			return true;
		}*/
		return false;
	}

	@Override
	public boolean login2(String username, String password) {
		User loginUser = new User();
		loginUser.setUsername(username);
		loginUser.setPassword(password);
		User authUser = userMapper.findUserByUsernameAndPassword(loginUser);
		if (authUser != null) {
			return true;
		}
		return false;
	}

}
