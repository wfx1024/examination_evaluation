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
    @RequestMapping("/analyse")
    public ModelAndView toAnalyse(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        List searchList = indexService.newsGYears();
        modelAndView.addObject("years",searchList);
        modelAndView.setViewName("analyse");
        return modelAndView;
    }

    @RequestMapping("/arts")
    public ModelAndView toArticle(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("articleList");
        return modelAndView;
    }
}
