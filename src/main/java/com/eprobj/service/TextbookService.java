package com.eprobj.service;

import com.eprobj.entity.Textbook;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TextbookService
 * @Description TODO
 * @Author kangjian
 * @Date 2019/12/31 13:00
 * @Version 1.0
 **/

public interface TextbookService {

    Long count(Map params);

    List<Textbook> page(Map params);

    List<String> findAllType();

    List<String> findAllLanguage();

    boolean deleteByIds(List<Integer> ids);

    Textbook detail(String id);

    int save(Textbook textbook);

    int updateByDocId(Textbook textbook);

}