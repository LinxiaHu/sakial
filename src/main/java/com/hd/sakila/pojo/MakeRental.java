package com.hd.sakila.pojo;

import java.util.List;


/**
 * @author Chunyun
 * 用于映射rental和inventory的一对多关系
 */
public class MakeRental extends Rental {
	private List<MakeInventory> inventories;

	public List<MakeInventory> getInventories() {
		return inventories;
	}

	public void setInventories(List<MakeInventory> inventories) {
		this.inventories = inventories;
	}

	
}
