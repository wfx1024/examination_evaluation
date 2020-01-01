package com.eprobj.service;

import com.eprobj.entity.Expert;
import com.eprobj.entity.NEWS;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IExpertService {

    List<Expert> expertList(Expert expert);
    int expertCount(Expert expert);
    List areaList();
    int deleteExpert(List expertIDs);

    List<Map> expertSubject();
    List<Map> expertSubject1();
    List<Map> expertSubject2();
    List<Map> expertSubject3();

}
