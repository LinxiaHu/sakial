package com.hd.sakila.mapper;

import com.hd.sakila.pojo.Store;
import com.hd.sakila.pojo.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
	int countByExample(StoreExample example);

	int deleteByExample(StoreExample example);

	int deleteByPrimaryKey(Byte storeId);

	int insert(Store record);

	int insertSelective(Store record);

	List<Store> selectByExample(StoreExample example);

	Store selectByPrimaryKey(Byte storeId);

	int updateByExampleSelective(@Param("record") Store record,
			@Param("example") StoreExample example);

	int updateByExample(@Param("record") Store record,
			@Param("example") StoreExample example);

	int updateByPrimaryKeySelective(Store record);

	int updateByPrimaryKey(Store record);
}