package com.hd.sakila.pojo;

import java.util.List;


/**
 * @author Chunyun
 * 用于映射inventory与film的一对多关系
 */
public class MakeInventory extends Inventory {
	private List<Film> films;

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
	
}
