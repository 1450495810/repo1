package com.shenyu.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.shenyu.dao.ItemsDao;
import com.shenyu.entity.Items;

public class ItemsTest {
	
	
	
	
	@Test
	public void test1() throws Exception {
		String resource="mybatis-config.xml";
		
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession();
		ItemsDao dao = sqlSession.getMapper(ItemsDao.class);
//		List<Items> findAll = dao.findAll();
//		Items findAll = dao.findById(1);
//		System.out.println(findAll);
		
		Items i=new Items();
		i.setId(4);
		i.setName("123123");
		i.setPrice(4555);
		i.setCreateTime("2019-10-24");
		dao.update(i);
		
		
		sqlSession.commit();
//		dao.save(i);
		
		
	}
	
	
}
