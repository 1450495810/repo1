package com.shenyu.dao;

import java.util.List;

import com.shenyu.entity.OrderDetail;

public interface OrderDetailDao {
	
	List<OrderDetail> findAll();
	OrderDetail findById(int id);
	void save(OrderDetail OrderDetail);
	void update(OrderDetail OrderDetail);
	void del(int id);
	
	
}
