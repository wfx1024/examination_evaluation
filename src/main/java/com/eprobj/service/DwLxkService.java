package com.eprobj.service;

import com.eprobj.entity.BookOrgLocal;
import com.eprobj.entity.NEWS;

import java.util.List;
import java.util.Map;

public interface DwLxkService {
    List<BookOrgLocal> searchList ( BookOrgLocal bookOrgLocal );

    int  delete (List<String> newsIds);

    int countAll();
}
