package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Items {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String itemName;
	private  double cost;
	@ManyToOne
	AmazonOrder amazonOrder;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public AmazonOrder getAmazonOrder() {
		return amazonOrder;
	}
	public void setAmazonOrder(AmazonOrder amazonOrder) {
		this.amazonOrder = amazonOrder;
	}
	
	
}
