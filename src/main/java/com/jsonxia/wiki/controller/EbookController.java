package com.jsonxia.wiki.controller;

import com.jsonxia.wiki.domain.Ebook;
import com.jsonxia.wiki.resp.CommonResp;
import com.jsonxia.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: wiki
 * <p>
 * Created by xiameilin on 2022/1/29 上午9:15
 */

@RestController
@RequestMapping("/ebook")
public class EbookController {


    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list(){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setContent(list);
        return resp;
    }


}
