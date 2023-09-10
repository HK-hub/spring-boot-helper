package com.hk.helper;

import com.hk.transformation.core.annotation.dynamic.EnableDynamicValue;
import com.hk.transformation.domain.response.ResponseResult;
import com.hk.transformation.web.controller.TransformationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDynamicValue
@SpringBootApplication
public class SpringBootHelperApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootHelperApplication.class, args);
        TransformationController bean = applicationContext.getBean(TransformationController.class);
        System.out.println(bean);
        ResponseResult responseResult = bean.getAllDynamicValues();
        System.out.println(responseResult);
    }

}
