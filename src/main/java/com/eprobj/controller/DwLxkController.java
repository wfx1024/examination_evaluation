package com.eprobj.controller;

import com.eprobj.entity.BookOrgLocal;
import com.eprobj.service.DwLxkService;
import com.eprobj.util.RespUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by WXX on 2019/12/31.
 * 全国图书出版单位联络库
 */
@Controller
@RequestMapping("/dwlxk")
public class DwLxkController {
    @Autowired
    private DwLxkService dwLxkService;


    /**
     * 跳转到国图出版联络单位
     * @return
     */
    @RequestMapping("/dwlxkart")
    public ModelAndView   dwlXk(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("dwlxkArticleList");
        return modelAndView;
    }

    /**
     * 编辑
     * @return
     */
    @RequestMapping("/editdw")
    public ModelAndView   edirDw(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editdwlxk");
        return modelAndView;
    }
    /**
     * 编辑
     * @return
     */
    @RequestMapping("/senedmessage")
    public ModelAndView   sendMessage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sendmessage");
        return modelAndView;
    }
    /**
     * 增加信息
     * @return
     */
    @RequestMapping("/adddw")
    public ModelAndView   addDw(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adddwlxk");
        return modelAndView;
    }

    /**
     * ajax自动自动获取数据
     * @param bookOrgLocal
     * @return
     */
    @ResponseBody
    @RequestMapping("/indexdatalist")
    public String indexData( BookOrgLocal bookOrgLocal){
        bookOrgLocal.setPage ( bookOrgLocal.getPage ()-1 );
        List<BookOrgLocal> bookOrgLocals= dwLxkService.searchList ( bookOrgLocal );
        int searchCount= dwLxkService.countAll (bookOrgLocal);
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "查询成功！", bookOrgLocals,searchCount);
    }
    @ResponseBody
    @RequestMapping("/delete")
    public String deleteData( @RequestParam (value="newsIds[]") List<String> newsIds){
        int num =dwLxkService.delete ( newsIds );
        return RespUtil.getResp(RespUtil.RESP_CODE_SUCCESS, "删除成功！", num);
    }

}
