package com.shenyu.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.shenyu.dao.OrderDetailDao;
import com.shenyu.dao.UserDao;
import com.shenyu.entity.OrderDetail;
import com.shenyu.entity.User;

public class OrderDetailTest {
	
	
	
	@Test
	public void test1() throws Exception {
		String resource="mybatis-config.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession();
		OrderDetailDao dao = sqlSession.getMapper(OrderDetailDao.class);
		List<OrderDetail> all = dao.findAll();
		for(OrderDetail o:all) {
			System.out.println(o);
		}
		sqlSession.commit();
		
	}
	
	
}
