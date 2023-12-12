package com.gbhu.service.impl;

import com.gbhu.service.UserService;
//import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//@DubboService(version = "1.0.0") //注解配置
@Service //xml配置
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    public String sayHello() {
        LOGGER.info("方法被调用");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }
}
