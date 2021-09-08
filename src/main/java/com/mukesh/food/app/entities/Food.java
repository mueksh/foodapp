package com.mukesh.food.app.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@javax.persistence.Entity
@Table(name = "foodInfo")
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String restaurantName;
	private String distributorName;
	private String address;
	private long phone;
	private String email;
	private String foodDetail;
	private String enddate;
	private double price;

	
	
	public String getRestaurantName() {
		return restaurantName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", restaurantName=" + restaurantName + ", distributorName=" + distributorName
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + ", foodDetail=" + foodDetail
				+ ", enddate=" + enddate + ", price=" + price + "]";
	}
}
