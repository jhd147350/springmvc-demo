package jhd.comfig;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {

	public static SqlSessionFactory getFactory() {
		String resource = "mybatis-config.xml";

		//加载mybatis 的配置文件（它也加载关联的映射文件）
		InputStream is = MyBatisConfig.class.getClassLoader().getResourceAsStream(resource);

		// 构建sqlSession 的工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		return factory;
	}

}
