package com.hd.sakila.mapper;

import com.hd.sakila.pojo.Category;
import com.hd.sakila.pojo.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {
	int countByExample(CategoryExample example);

	int deleteByExample(CategoryExample example);

	int deleteByPrimaryKey(Byte categoryId);

	int insert(Category record);

	int insertSelective(Category record);

	List<Category> selectByExample(CategoryExample example);

	Category selectByPrimaryKey(Byte categoryId);

	int updateByExampleSelective(@Param("record") Category record,
			@Param("example") CategoryExample example);

	int updateByExample(@Param("record") Category record,
			@Param("example") CategoryExample example);

	int updateByPrimaryKeySelective(Category record);

	int updateByPrimaryKey(Category record);
}