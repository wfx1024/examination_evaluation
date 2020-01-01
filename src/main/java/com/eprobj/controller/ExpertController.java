package com.eprobj.controller;

import com.eprobj.entity.Expert;
import com.eprobj.entity.NEWS;
import com.eprobj.service.IExpertService;
import com.eprobj.service.impl.ExpertServiceImpl;
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
@RequestMapping("/experts")
public class ExpertController {
    @Autowired
    public  IExpertService iExpertService;

    //统计所选的类别统计图
    @RequestMapping("/parm")
    @ResponseBody
    public String searchList(@RequestParam(value="leibie") String leibie){

        if (StringUtils.isBlank(leibie)){
            return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", null);
        }
        if ("IR_ESUBJECT".equals(leibie)){
            System.out.println("-----------------------------IR_ESUBJECT-----------");
            List<Map> newsAnalyseList  = iExpertService.expertSubject();
            System.out.println(newsAnalyseList+"------------IR_ESUBJECT");
            return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", newsAnalyseList);

        }else if("IR_EPROVINCE".equals(leibie)){
            System.out.println("--------------------IR_EPROVINCE-----------------------");
            List<Map> newsAnalyseList1  = iExpertService.expertSubject1();
            System.out.println(newsAnalyseList1+"------------IR_EPROVINCE");
            return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", newsAnalyseList1);
        }

        return RespUtil.getResp(RespUtil.RESP_CODE_ERROR, "查询失败！", null);
//        Map param = new HashMap();
//        param.put("leibie", leibie);
    }



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


