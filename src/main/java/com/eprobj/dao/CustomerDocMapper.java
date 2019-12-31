package com.eprobj.dao;
import com.eprobj.entity.NEWS;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by WFX1024 on 2018/11/24.
 */
@Repository
public interface CustomerDocMapper {

    List<NEWS> newsList(NEWS news);
    int newsCount(NEWS news);
    List<String> areaList();
    int deleteNews(@Param("newsIds")List newsIds);

    List<String> newsGYears();
    List<Map> newsAnalyse(@Param("param") Map param);

}

