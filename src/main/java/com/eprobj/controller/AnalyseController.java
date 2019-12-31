package com.eprobj.controller;

import com.eprobj.entity.NEWS;
import com.eprobj.service.IndexService;
import com.eprobj.util.RespUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/analyse")
public class AnalyseController {

    @Autowired
    IndexService indexService;

    @RequestMapping("/list")
    @ResponseBody
    public String searchList(@RequestParam(value="year") String year){
        Map param = new HashMap();
        if (StringUtils.isBlank(year)){
            return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", null);
        }
        param.put("year",year);
        List<Map>  newsAnalyseList = indexService.newsAnalyse(param);
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", newsAnalyseList);
    }

    @RequestMapping("/yearList")
    @ResponseBody
    public String areaList(){
        List searchList = indexService.newsGYears();
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", searchList);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteNews(@RequestParam(value="newsIds[]") List<String> newsIds){
        int num = indexService.deleteNews(newsIds);
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "删除成功！", num);
    }

}
