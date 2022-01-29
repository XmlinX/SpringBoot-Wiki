package com.jsonxia.wiki.service;

import com.jsonxia.wiki.domain.Ebook;
import com.jsonxia.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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


    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }

}
