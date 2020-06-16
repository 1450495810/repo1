package com.shenyu.dao;

import java.util.List;

import com.shenyu.entity.User;

public interface UserDao {
	
	List<User> findAll();
	User findById(int id);
	void save(User user);
	void update(User user);
	void del(int id);
}
