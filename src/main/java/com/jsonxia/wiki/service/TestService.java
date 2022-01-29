package com.jsonxia.wiki.service;

import com.jsonxia.wiki.domain.Test;
import com.jsonxia.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: wiki
 * <p>
 * Created by xiameilin on 2022/1/29 下午4:59
 */

@Service
public class TestService {


    @Resource
    private TestMapper testMapper;


    public List<Test> list(){
        return testMapper.list();
    }

}
