package com.eprobj.controller;

import com.eprobj.entity.Expert;
import com.eprobj.entity.NEWS;
import com.eprobj.service.IExpertService;
import com.eprobj.util.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/experts")
public class ExpertController {
    @Autowired
    private IExpertService iExpertService;


    @RequestMapping("/list")
    @ResponseBody
    public String searchList(Expert expert){
        List<Expert> searchList = iExpertService.expertList(expert);
        int searchCount= iExpertService.expertCount(expert);
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", searchList,searchCount);
    }

    @RequestMapping("/areaList")
    @ResponseBody
    public String areaList(Expert expert){
        List<Expert> searchList = iExpertService.areaList();
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", searchList);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteNews(@RequestParam(value="expertIDs[]") List<String> expertIds){
        System.out.println(expertIds);
       int num = iExpertService.deleteExpert(expertIds);
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "删除成功！", num);
    }



}


