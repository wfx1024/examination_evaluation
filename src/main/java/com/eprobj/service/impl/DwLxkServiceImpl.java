package com.eprobj.service.impl;

import com.eprobj.dao.CustomerDocMapper;
import com.eprobj.dao.DwLxkMapper;
import com.eprobj.entity.BookOrgLocal;
import com.eprobj.entity.NEWS;
import com.eprobj.service.DwLxkService;
import com.eprobj.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class DwLxkServiceImpl implements DwLxkService {

    @Autowired
    private DwLxkMapper dwLxkMapper;



    @Override
    public List<BookOrgLocal> searchList ( BookOrgLocal bookOrgLocal ) {
        return dwLxkMapper.newsList ( bookOrgLocal );
    }

    @Override
    public int delete ( List<String> newsIds ) {
        return dwLxkMapper.delete(newsIds);
    }

    @Override
    public int countAll (BookOrgLocal bookOrgLocal) {
        return dwLxkMapper.countAll (bookOrgLocal);
    }

}
