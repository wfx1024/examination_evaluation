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

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    IndexService indexService;

    @RequestMapping("/articleDetail")
    @ResponseBody
    public ModelAndView articleDetial(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("articleDetail");
        return modelAndView;
    }
}
