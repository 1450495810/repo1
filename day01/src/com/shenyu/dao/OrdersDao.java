package com.shenyu.dao;

import java.util.List;

import com.shenyu.entity.Orders;

public interface OrdersDao {
	
	List<Orders> findAll();
	Orders findById(int id);
	void save(Orders items);
	void update(Orders items);
	void del(int id);
}
