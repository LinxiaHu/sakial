package com.hd.sakila.mapper;

import com.hd.sakila.pojo.Film;
import com.hd.sakila.pojo.FilmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmMapper {
    int countByExample(FilmExample example);

    int deleteByExample(FilmExample example);

    int deleteByPrimaryKey(Short filmId);

    int insert(Film record);

    int insertSelective(Film record);

    List<Film> selectByExampleWithBLOBs(FilmExample example);

    List<Film> selectByExample(FilmExample example);

    Film selectByPrimaryKey(Short filmId);

    int updateByExampleSelective(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByExampleWithBLOBs(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByExample(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByPrimaryKeySelective(Film record);

    int updateByPrimaryKeyWithBLOBs(Film record);

    int updateByPrimaryKey(Film record);
}