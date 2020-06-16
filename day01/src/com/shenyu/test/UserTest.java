package com.shenyu.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.shenyu.dao.UserDao;
import com.shenyu.entity.User;

public class UserTest {
	
	
	
	@Test
	public void test1() throws Exception {
		String resource="mybatis-config.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession();
		UserDao dao = sqlSession.getMapper(UserDao.class);
		User user=new User();
		user.setId(1);
		user.setUsername("11111");
		dao.update(user);
		sqlSession.commit();
		
	}
	
	
}
