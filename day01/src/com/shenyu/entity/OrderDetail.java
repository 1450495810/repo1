package com.shenyu.entity;

public class OrderDetail {
	
	private String username;
	private String name;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int id;
	@Override
	public String toString() {
		return "OrderDetail [username=" + username + ", name=" + name + ", id=" + id + ", orders_id=" + orders_id
				+ ", items_id=" + items_id + ", items_num=" + items_num + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}
	public int getItems_id() {
		return items_id;
	}
	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}
	public int getItems_num() {
		return items_num;
	}
	public void setItems_num(int items_num) {
		this.items_num = items_num;
	}
	private int orders_id;
	private int items_id;
	private int items_num;
	
}
