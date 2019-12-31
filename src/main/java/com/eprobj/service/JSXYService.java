package com.eprobj.service;

import com.eprobj.entity.JSXY;
import java.util.List;
import java.util.Map;

public interface JSXYService {
    List<JSXY> searchList(JSXY news);
    int searchCount(JSXY news);
    List areaList();
    int deleteNews(List newsIds);

    List<String> newsGYears();
    List<Map> newsAnalyse(Map param);

}
