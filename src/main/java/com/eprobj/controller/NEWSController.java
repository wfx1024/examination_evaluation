package com.eprobj.controller;

import com.eprobj.entity.NEWS;
import com.eprobj.service.IndexService;
import com.eprobj.util.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/news")
public class NEWSController {

    @Autowired
    IndexService indexService;

    @RequestMapping("/list")
    @ResponseBody
    public String searchList(NEWS news){
        List<NEWS> searchList = indexService.searchList(news);
        int searchCount= indexService.searchCount(news);
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", searchList,searchCount);
    }

    @RequestMapping("/areaList")
    @ResponseBody
    public String areaList(NEWS news){
        List<NEWS> searchList = indexService.areaList();
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", searchList);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteNews(@RequestParam(value="newsIds[]") List<String> newsIds){
        int num = indexService.deleteNews(newsIds);
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "删除成功！", num);
    }

}
