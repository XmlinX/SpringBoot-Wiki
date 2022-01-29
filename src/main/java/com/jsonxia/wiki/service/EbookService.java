package com.jsonxia.wiki.service;

import com.jsonxia.wiki.domain.Ebook;
import com.jsonxia.wiki.domain.EbookExample;
import com.jsonxia.wiki.mapper.EbookMapper;
import com.jsonxia.wiki.req.EbookReq;
import com.jsonxia.wiki.resp.EbookResp;
import com.jsonxia.wiki.util.CopyUtil;
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

//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebookList) {
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
////            respList.add(ebookResp);
              // 对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }
        // 列表复制
        List<EbookResp> respList = CopyUtil.copyList(ebookList, EbookResp.class);
        return respList;
    }

}
