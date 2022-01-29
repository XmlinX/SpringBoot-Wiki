package com.jsonxia.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: wiki
 * <p>
 * Created by xiameilin on 2022/1/29 上午9:15
 */

@RestController
public class TestController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world-2";
    }


}
