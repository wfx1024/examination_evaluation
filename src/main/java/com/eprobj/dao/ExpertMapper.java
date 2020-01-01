package com.eprobj.dao;

import com.eprobj.entity.Expert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: ZHENGSHUAI
 * @Date: 12:54 2019/12/31
 * @Description:
 */
@Repository
public interface ExpertMapper {

    List<Expert> expertsList(Expert expert);
    int expertCount(Expert expert);

    List<String> areaList();
    int deleteExpert(@Param("expertIDs")List expertIDs);
    List<Map> expertSubject();

    List<Map> expertSubject1();




}
