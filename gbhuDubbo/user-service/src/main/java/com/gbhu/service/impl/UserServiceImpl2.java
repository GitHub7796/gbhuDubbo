package com.gbhu.service.impl;

import com.gbhu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//@DubboService(version = "1.0.0") //注解配置
@Service //xml配置
public class UserServiceImpl2 implements UserService {
    public String sayHello() {
        return "hello gbhu";
    }
}
