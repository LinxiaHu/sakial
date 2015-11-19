package com.hd.sakila.mapper;

import com.hd.sakila.pojo.Language;
import com.hd.sakila.pojo.LanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LanguageMapper {
    int countByExample(LanguageExample example);

    int deleteByExample(LanguageExample example);

    int deleteByPrimaryKey(Byte languageId);

    int insert(Language record);

    int insertSelective(Language record);

    List<Language> selectByExample(LanguageExample example);

    Language selectByPrimaryKey(Byte languageId);

    int updateByExampleSelective(@Param("record") Language record, @Param("example") LanguageExample example);

    int updateByExample(@Param("record") Language record, @Param("example") LanguageExample example);

    int updateByPrimaryKeySelective(Language record);

    int updateByPrimaryKey(Language record);
}