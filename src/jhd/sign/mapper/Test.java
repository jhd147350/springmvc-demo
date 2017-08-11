package jhd.sign.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jhd.config.MyBatisConfig;
import jhd.sign.entity.User;
import jhd.sign.service.UserService;
import jhd.sign.service.UserServiceImp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SqlSessionFactory factory = MyBatisConfig.getFactoryInstance();
		SqlSession openSession = factory.openSession();
		UserMapper mapper = openSession.getMapper(UserMapper.class);
		User u = new User();
		u.setUsername("jhd");
		u.setPassword("123456");
		User login = mapper.findUserByUsernameAndPassword(u);
		if (login != null) {
			System.out.println(u.getUsername());
			System.out.println(u.getPassword());
		} else {
			System.err.println("err");
		}*/
		
		UserService service=new UserServiceImp();
		System.out.println(service.login("jhd", "jhd"));
	}

}
