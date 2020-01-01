package com.eprobj.dao;

import com.eprobj.entity.Textbook;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TextbookMapper
 * @Description TODO
 * @Author kangjian
 * @Date 2019/12/31 12:01
 * @Version 1.0
 **/

public interface TextbookMapper {

    List<String> findAllType();

    Long count(Map map);

    List<Textbook> page(Map map);

    List<String> findAllLanguage();

    int deleteByIds(@Param("ids") List<Integer> ids);

    Textbook getById(String id);

    int save(Textbook textbook);

    int updateById(Textbook textbook);

    List<Map<String,Object>> statByType(@Param("type") String type);

}