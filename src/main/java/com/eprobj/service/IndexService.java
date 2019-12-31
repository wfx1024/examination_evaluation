package com.eprobj.service;

import com.eprobj.entity.NEWS;

import java.util.List;
import java.util.Map;

public interface IndexService {
    List<NEWS> searchList(NEWS news);
    int searchCount(NEWS news);
    List areaList();
    int deleteNews(List newsIds);

    List<String> newsGYears();
    List<Map> newsAnalyse(Map param);

}
