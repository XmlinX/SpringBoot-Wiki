package com.jsonxia.wiki.service;

import com.jsonxia.wiki.domain.Ebook;
import com.jsonxia.wiki.domain.EbookExample;
import com.jsonxia.wiki.mapper.EbookMapper;
import com.jsonxia.wiki.req.EbookReq;
import com.jsonxia.wiki.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: wiki
 * <p>
 * Created by xiameilin on 2022/1/29 下午4:59
 */

@Service
public class EbookService {


    @Resource
    private EbookMapper ebookMapper;


    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);
            respList.add(ebookResp);
        }
        return respList;
    }

}
