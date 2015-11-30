package com.hd.sakila.pojo;

import java.util.List;

/**
 * @author Chunyun
 * 自定义Customer类，用于映射customer与rental的一对多关系
 */
public class MakeCustomer extends Customer {
	private List<MakeRental> rentals;

	public List<MakeRental> getRentals() {
		return rentals;
	}

	public void setRentals(List<MakeRental> rentals) {
		this.rentals = rentals;
	}
	
		
}
