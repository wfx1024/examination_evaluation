package com.eprobj.service;

import com.eprobj.entity.Expert;
import com.eprobj.entity.NEWS;

import java.util.List;
import java.util.Map;

public interface IExpertService {

    List<Expert> expertList(Expert expert);
    int expertCount(Expert expert);
    List areaList();
    int deleteExpert(List expertIDs);

//    List<String> expertsGYears();
//    List<Map> expertsAnalyse(Map param);
}
