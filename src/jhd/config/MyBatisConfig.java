package jhd.config;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	static final String MYBATIS_CONFIG = "mybatis-config.xml";
	static SqlSessionFactory factoryInstance;

	static {
		// 加载mybatis 的配置文件（它也加载关联的映射文件）
		InputStream is = MyBatisConfig.class.getClassLoader().getResourceAsStream(MYBATIS_CONFIG);

		// 构建sqlSession 的工厂
		factoryInstance = new SqlSessionFactoryBuilder().build(is);

	}

	public static SqlSessionFactory getFactoryInstance() {
		return factoryInstance;

	}

}
