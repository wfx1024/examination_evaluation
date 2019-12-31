package com.eprobj.service.impl;

import com.eprobj.dao.TextbookMapper;
import com.eprobj.entity.Textbook;
import com.eprobj.service.TextbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TextbookServiceImpl
 * @Description TODO
 * @Author kangjian
 * @Date 2019/12/31 13:03
 * @Version 1.0
 **/
@Service
public class TextbookServiceImpl implements TextbookService {

    @Autowired
    private TextbookMapper textbookMapper;

    @Override
    public Long count(Map params) {
        return textbookMapper.count(params);
    }

    @Override
    public List<Textbook> page(Map params) {
        return textbookMapper.page(params);
    }

    @Override
    public List<String> findAllType() {
        return textbookMapper.findAllType();
    }

    @Override
    public List<String> findAllLanguage() {
        return textbookMapper.findAllLanguage();
    }

    @Override
    public boolean deleteByIds(List<Integer> ids) {
        try {
            if (textbookMapper.deleteByIds(ids)<=0)
                throw new Exception("系统异常");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Textbook detail(String id) {
        return textbookMapper.getById(id);
    }

    @Override
    public int save(Textbook textbook) {
        return textbookMapper.save(textbook);
    }

    @Override
    public int updateByDocId(Textbook textbook) {
        return textbookMapper.updateById(textbook);
    }

    @Override
    public List<Map<String, Object>> statByType(String type) {
        return textbookMapper.statByType(type);
    }
}