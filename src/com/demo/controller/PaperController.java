package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.common.vo.JsonResult;
import com.demo.entity.Paper;
import com.demo.service.PaperService;
@Controller
@RequestMapping("/paper/")
public class PaperController {
	@Autowired
    private PaperService paperService;//持有一个业务层对象
	//ajax查询数据
    @RequestMapping("findAllById")
    @ResponseBody
    public JsonResult findAllById(@RequestParam("pId")int id) {
    	Paper paper = paperService.findAllById(id);
        return new JsonResult(paper);
    }
    /**
     * 创建调查问卷
     * @return
     */
    @RequestMapping("createPaper")
    @ResponseBody
	public JsonResult createPaper(){
		return null;
	}
}