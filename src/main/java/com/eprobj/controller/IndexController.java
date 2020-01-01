package com.eprobj.controller;

import com.eprobj.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    IndexService indexService;

    @RequestMapping("/index")
    public ModelAndView toIndex(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("newslist");
        return modelAndView;
    }

    @RequestMapping("/expert")
    public ModelAndView toExpert(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("expertlist");
        return modelAndView;
    }

    /**
     * 编辑查看
     * @param request
     * @return
     */
    @RequestMapping("/expert1")
    public ModelAndView toExpert1(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("expertlist");
        return modelAndView;
    }

    /**
     * @Author: ZHENGSHUAI
     * @Date: 16:04 2019/12/31
     * @Description:新建
     */
    @RequestMapping("/create")
    public ModelAndView toCreate(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("create");
        return modelAndView;
    }

    /**
     * @Author: ZHENGSHUAI
     * @Date: 16:04 2019/12/31
     * @Description:编辑
     */
    @RequestMapping("/edit")
    public ModelAndView toEdit(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        return modelAndView;
    }

    @RequestMapping("/analyse")
    public ModelAndView toAnalyse(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        List searchList = indexService.newsGYears();
        modelAndView.addObject("years",searchList);
        modelAndView.setViewName("analyse");
        return modelAndView;
    }
    @RequestMapping("/statistics")
    public ModelAndView toStatistics(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        List searchList = indexService.newsGYears();
        modelAndView.addObject("years",searchList);
        modelAndView.setViewName("statistics");
        return modelAndView;
    }

    @RequestMapping("/arts")
    public ModelAndView toArticle(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("articleList");
        return modelAndView;
    }
}
