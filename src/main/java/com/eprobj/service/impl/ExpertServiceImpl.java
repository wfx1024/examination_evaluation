package com.eprobj.service.impl;

import com.eprobj.controller.ExpertController;
import com.eprobj.dao.CustomerDocMapper;
import com.eprobj.dao.ExpertMapper;
import com.eprobj.entity.Expert;
import com.eprobj.entity.NEWS;
import com.eprobj.service.IExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class ExpertServiceImpl implements IExpertService {
    @Autowired
    private ExpertMapper expertMapper;


    @Override
    public List<Expert> expertList(Expert expert) {
        List<Expert>  maps = expertMapper.expertsList(expert);
        return  maps;
    }

    @Override
    public int expertCount(Expert expert) {
        return expertMapper.expertCount(expert);
    }

    @Override
    public List areaList() {
        List<String> area = Arrays.asList("北京、天津、河北、山西、内蒙古、辽宁、吉林、黑龙江、上海、江苏、浙江、安徽、福建、江西、山东、河南、湖北、湖南、广东、广西、海南、重庆、四川、贵州、云南、西藏、陕西、甘肃、青海、宁夏、新疆".split("、"));
        List<String> stringList = expertMapper.areaList();
        Collections.sort(stringList, (o1, o2) -> {
            int io1 = area.indexOf(o1);
            int io2 = area.indexOf(o2);
            return io1 - io2;
        });
        return stringList;
    }

    @Override
    public int deleteExpert(List expertIDs) {
        return expertMapper.deleteExpert(expertIDs);
    }

    @Override
    public List<Map> expertSubject() {
        return expertMapper.expertSubject();
    }

    @Override
    public List<Map> expertSubject1() {
        return expertMapper.expertSubject1();
    }

    @Override
    public List<Map> expertSubject2() {
        return expertMapper.expertSubject2();
    }

    @Override
    public List<Map> expertSubject3() {
        return expertMapper.expertSubject3();
    }


}
