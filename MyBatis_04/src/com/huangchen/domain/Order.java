package com.huangchen.domain;
/**
 * 定义order表对应的实体表
 */

public class Order {
	/**
	 * CREATE TABLE orders
	 * ( order_id INT PRIMARY KEY AUTO_INCREMENT, 
	 * order_no VARCHAR ( 20 ), 
	 * order_price FLOAT );
	 */

	//Order实体表中属性名和orders表中的字段名是不一样的
	private int id;//id ==>order_id
	private String orderNo;//orderNo==>order_no
	private float price;//price==>order_price
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNo=" + orderNo + ", price=" + price
				+ ", getId()=" + getId() + ", getOrderNo()=" + getOrderNo()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



}
