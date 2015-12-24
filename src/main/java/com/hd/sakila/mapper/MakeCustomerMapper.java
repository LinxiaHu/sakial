package com.hd.sakila.mapper;

import java.util.List;

import com.hd.sakila.pojo.CustomQueryVo;
import com.hd.sakila.pojo.MakeCustomer;


public interface MakeCustomerMapper {
	//
    public List<MakeCustomer> queryCustomFilm(CustomQueryVo customQueryVo);
}