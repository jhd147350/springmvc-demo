package jhd.dao;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jhd.comfig.MyBatisConfig;
import jhd.entity.User;

public class UserDao {

	public User getUserById() {

		SqlSessionFactory factory = MyBatisConfig.getFactory();
		SqlSession openSession = factory.openSession();
		User u = openSession.selectOne("jhd.entity.mapper.userMapper.getUser", 1);
		openSession.close();
		return u;
	}

	public List<User> getAllUser() {

		SqlSessionFactory factory = MyBatisConfig.getFactory();
		SqlSession openSession = factory.openSession();
		List<User> users = openSession.selectList("jhd.entity.mapper.userMapper.getAllUser", 1);
		openSession.close();
		return users;
	}
	
	public static void main(String[] args) {
		UserDao dao=new UserDao();
		User userById = dao.getUserById();
		//List<User> allUser = dao.getAllUser();
		System.out.println(userById.toString());
		//System.out.println(allUser.toString());
	}
}
