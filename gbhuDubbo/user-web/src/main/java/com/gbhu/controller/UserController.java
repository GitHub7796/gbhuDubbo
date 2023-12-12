package com.gbhu.controller;

import com.gbhu.service.FileService;
import com.gbhu.service.UserService;
//import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UserController {

//    @DubboReference(version = "1.0.0",url = "dubbo://127.0.0.1:12345")//不使用zookeeper
//    @DubboReference(version = "1.0.0")//使用zookeeper，url从zookeeper获取
//    @DubboReference(version = "1.0.0",check = false)//关闭启动时检查
    @Autowired //xml配置
    private UserService userService;

//    @Autowired
//    private FileService fileService;

//    @RequestMapping("upload")
//    public void upload(@RequestParam(value = "msg") String msg) {
//        fileService.upload(msg);
//    }
    @RequestMapping("sayHello")
    public String sayHello() {
        return userService.sayHello();
    }
}
