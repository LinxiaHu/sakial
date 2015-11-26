package com.hd.sakila.mapper;

import com.hd.sakila.pojo.FilmCategory;
import com.hd.sakila.pojo.FilmCategoryExample;
import com.hd.sakila.pojo.FilmCategoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmCategoryMapper {
    int countByExample(FilmCategoryExample example);

    int deleteByExample(FilmCategoryExample example);

    int deleteByPrimaryKey(FilmCategoryKey key);

    int insert(FilmCategory record);

    int insertSelective(FilmCategory record);

    List<FilmCategory> selectByExample(FilmCategoryExample example);

    FilmCategory selectByPrimaryKey(FilmCategoryKey key);

    int updateByExampleSelective(@Param("record") FilmCategory record, @Param("example") FilmCategoryExample example);

    int updateByExample(@Param("record") FilmCategory record, @Param("example") FilmCategoryExample example);

    int updateByPrimaryKeySelective(FilmCategory record);

    int updateByPrimaryKey(FilmCategory record);
}