package com.eprobj.controller;

import com.eprobj.entity.Textbook;
import com.eprobj.service.TextbookService;
import com.eprobj.util.RespUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TextbookController
 * @Description TODO
 * @Author kangjian
 * @Date 2019/12/31 11:26
 * @Version 1.0
 **/

@Controller
@RequestMapping("/textbook")
public class TextbookController {

    @Autowired
    private TextbookService textbookService;

    @RequestMapping("/toTextbook")
    public String toTextbook() {
        return "textbook/index";
    }

    @RequestMapping("/list-page")
    @ResponseBody
    public Object listPage(@RequestParam("name") String name,
                           @RequestParam("language") String language,
                           @RequestParam("isbn") String isbn,
                           @RequestParam("textbookType") String textbookType,
                           @RequestParam("author") String author,
                           @RequestParam(value="page", defaultValue="1") Integer page,
                           @RequestParam(value="limit", defaultValue="20") Integer limit) {
        Map params = new HashMap();
        params.put("name",name);
        params.put("language",language);
        params.put("isbn",isbn);
        params.put("textbookType",textbookType);
        params.put("index",(page-1)*limit);
        params.put("limit",limit);
        params.put("author",author);
        Long count = textbookService.count(params);
        List<Textbook> textbookList = textbookService.page(params);
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS,"文档查询成功",textbookList, count);
    }

    @RequestMapping("/type")
    @ResponseBody
    public Object type() {
        List<String> typeList = textbookService.findAllType();
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS,"文档查询成功",typeList, typeList.size());
    }

    @RequestMapping("/language")
    @ResponseBody
    public Object language() {
        List<String> allLanguage = textbookService.findAllLanguage();
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS,"文档查询成功",allLanguage, allLanguage.size());
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(@RequestParam(value = "ids[]") List<Integer> ids) {
        if (!textbookService.deleteByIds(ids))
            return RespUtil.getResp(RespUtil.RESP_CODE_FAIL, "系统异常", null);
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "删除成功", null);
    }

    @RequestMapping("/toEdit")
    public ModelAndView toEdit(HttpServletRequest request) {
        String id = request.getParameter("id");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("textbook/edit");
        Textbook textbook = new Textbook();
        if (StringUtils.isNotBlank(id)) {
        textbook = textbookService.detail(id);
        if (textbook.getEditionDate() != null) {
            textbook.setEditionDate(textbook.getEditionDate().replace("年","-").replace("月",""));
        }
        if (textbook.getEditionBack() != null) {
            textbook.setEditionBack(textbook.getEditionBack().replace("年","-").replace("月",""));
        }
        mav.addObject("textbook",textbook);
        }
        return mav;
    }

    @RequestMapping("/save")
    @ResponseBody
    public Object save(Textbook textbook) {
        int rownum = 0;
        try {
            if (textbook.getId() != null) {
                rownum = textbookService.updateByDocId(textbook);
            } else {
                rownum = textbookService.save(textbook);
            }
            return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "成功保存", rownum);
        } catch (Exception e) {
             e.printStackTrace();
            return RespUtil.getResp(RespUtil.RESP_CODE_FAIL, "保存失败", rownum);
        }
    }

    @RequestMapping("/toStat")
    public ModelAndView toStat() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/textbook/stat");
        mav.addObject("type",1);
       return mav;
    }

    @RequestMapping("/stat")
    @ResponseBody
    public Object stat(HttpServletRequest request) {
        String type = request.getParameter("type");
        if (!StringUtils.isNotBlank(type)) {
            type = "1";
        }
        List<Map<String,Object>> mapList = textbookService.statByType(type);
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "成功保存", mapList);
    }

}