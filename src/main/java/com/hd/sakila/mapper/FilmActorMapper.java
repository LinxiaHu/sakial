package com.hd.sakila.mapper;

import com.hd.sakila.pojo.FilmActor;
import com.hd.sakila.pojo.FilmActorExample;
import com.hd.sakila.pojo.FilmActorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmActorMapper {
    int countByExample(FilmActorExample example);

    int deleteByExample(FilmActorExample example);

    int deleteByPrimaryKey(FilmActorKey key);

    int insert(FilmActor record);

    int insertSelective(FilmActor record);

    List<FilmActor> selectByExample(FilmActorExample example);

    FilmActor selectByPrimaryKey(FilmActorKey key);

    int updateByExampleSelective(@Param("record") FilmActor record, @Param("example") FilmActorExample example);

    int updateByExample(@Param("record") FilmActor record, @Param("example") FilmActorExample example);

    int updateByPrimaryKeySelective(FilmActor record);

    int updateByPrimaryKey(FilmActor record);
}