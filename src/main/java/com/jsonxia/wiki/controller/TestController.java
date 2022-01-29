package com.jsonxia.wiki.controller;

import com.jsonxia.wiki.domain.Test;
import com.jsonxia.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: wiki
 * <p>
 * Created by xiameilin on 2022/1/29 上午9:15
 */

@RestController
public class TestController {


    @Resource
    private TestService testService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world-2";
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }


}
