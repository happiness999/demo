package com.taotao.manager.controller;

import com.taotao.manager.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by BenJobs on 2017/5/8.
 */
@Controller
@RequestMapping("demo")
public class TestController {
    @Resource
    private TestService testService;

    @ResponseBody
    @RequestMapping("date")
    public String getSystemDate(){
        String date = testService.getSystemDate();
        return date;
    }
}
