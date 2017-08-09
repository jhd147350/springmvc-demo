package jhd.sign.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jhd.sign.entity.User;

public interface UserMapper {
	public static final String TABLE_NAME = "user";

	/**
	 * 登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@Select("select * from "+TABLE_NAME+" where username=#{u.username} and password=#{u.password}")
	public User findUserByUsernameAndPassword(@Param("u") User u);

	@Insert("insert into "+TABLE_NAME+" (username,password) values(#{u.username},#{u.password})")
	public int insertUser(User u);
}
