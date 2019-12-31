package com.eprobj.service.impl;

import com.eprobj.dao.JSSYMapper;
import com.eprobj.entity.JSXY;
import com.eprobj.service.JSSYService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class JSSYServiceImpl implements JSSYService {

    @Autowired
    private JSSYMapper customerDocMapper;

    public List<JSXY> searchList(JSXY news){
       List<JSXY>  maps = customerDocMapper.newsList(news);
       return  maps;
    }

    @Override
    public int searchCount(JSXY news) {
        return customerDocMapper.newsCount(news);
    }

    @Override
    public List areaList() {
        List<String> area = Arrays.asList("北京、天津、河北、山西、内蒙古、辽宁、吉林、黑龙江、上海、江苏、浙江、安徽、福建、江西、山东、河南、湖北、湖南、广东、广西、海南、重庆、四川、贵州、云南、西藏、陕西、甘肃、青海、宁夏、新疆".split("、"));
        List<String> stringList = customerDocMapper.areaList();
        Collections.sort(stringList, (o1, o2) -> {
            int io1 = area.indexOf(o1);
            int io2 = area.indexOf(o2);
            return io1 - io2;
        });
        return stringList;
    }

    @Override
    public int deleteNews(List newsIds) {
        return customerDocMapper.deleteNews(newsIds);
    }




    @Override
    public List<String> newsGYears() {
        return customerDocMapper.newsGYears();
    }

    @Override
    public List<Map> newsAnalyse(Map param) {
        return customerDocMapper.newsAnalyse(param);
    }
}
