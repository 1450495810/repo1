package com.shenyu.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.shenyu.dao.OrdersDao;
import com.shenyu.entity.Orders;

public class OrdersTest {

	@Test
	public void test1() throws Exception {
		String resource="mybatis-config.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession();
		OrdersDao dao = sqlSession.getMapper(OrdersDao.class);
//		List<Orders> all = dao.findAll();
//		Orders all = dao.findById(3);
//		System.out.println(all);
//		Orders order=new Orders();
//		order.setId(3);
//		order.setUser_id(10);
//		order.setNumber("6231");
//		order.setCreateTime("2015-03-23");
////		dao.save(order);
//		dao.update(order);
		dao.del(6);
		
		sqlSession.commit();
		
		
	}
}
