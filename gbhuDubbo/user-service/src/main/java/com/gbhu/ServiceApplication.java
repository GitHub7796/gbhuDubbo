package com.gbhu;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
@ImportResource("provider.xml")
@EnableApolloConfig(value = "application")
public class ServiceApplication {
    public static void main(String[] args) {
//        SpringApplication.run(ServiceApplication.class,args);
//        需要如下进行启动，不然用注册中心会报错
        new SpringApplicationBuilder(ServiceApplication.class).web(WebApplicationType.NONE).run();

    }
}
