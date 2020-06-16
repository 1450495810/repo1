package com.shenyu.dao;

import java.util.List;

import com.shenyu.entity.Items;

public interface ItemsDao {
	
	List<Items> findAll();
	Items findById(int id);
	void save(Items items);
	void update(Items items);
	void del(int id);
}
