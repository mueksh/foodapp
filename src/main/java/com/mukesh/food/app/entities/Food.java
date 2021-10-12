package com.mukesh.food.app.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Food {
	
	@Transient
	public static final  String SEQUENCE_NAME="user_sequence";   
	
	@Id
	private int id;
	@Field
	private String restaurantName;
	@Field
	private String distributorName;
	@Field
	private String address;
	@Field
	private long phone;
	@Field
	private String email;
	@Field
	private String foodDetail;
	@Field
	private String enddate;
	@Field
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFoodDetail() {
		return foodDetail;
	}
	public void setFoodDetail(String foodDetail) {
		this.foodDetail = foodDetail;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(int id, String restaurantName, String distributorName, String address, long phone, String email,
			String foodDetail, String enddate, double price) {
		super();
		this.id = id;
		this.restaurantName = restaurantName;
		this.distributorName = distributorName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.foodDetail = foodDetail;
		this.enddate = enddate;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", restaurantName=" + restaurantName + ", distributorName=" + distributorName
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + ", foodDetail=" + foodDetail
				+ ", enddate=" + enddate + ", price=" + price + "]";
	}
	
	
	
}
