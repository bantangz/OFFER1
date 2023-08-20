package com.main.config.h;

import com.yyds.config.PersonUtilSDKConfig;
import com.yyds.util.PersonUtil;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class Main {

    @Resource
    PersonUtilSDKConfig personUtilSDKConfig;

    public void haha() {
        PersonUtil personUtil = personUtilSDKConfig.getPersonUtil();
        personUtil.haha();
        personUtil.getName();
    }
}