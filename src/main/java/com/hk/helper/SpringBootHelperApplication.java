package com.hk.helper;

import com.hk.transformation.core.annotation.dynamic.EnableDynamicValue;
import com.hk.transformation.core.context.TransformContext;
import com.hk.transformation.core.value.TransformableValue;
import com.hk.transformation.domain.response.ResponseResult;
import com.hk.transformation.web.controller.TransformationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.Collection;
import java.util.List;

@EnableDynamicValue
@SpringBootApplication
public class SpringBootHelperApplication {

    public static void main(String[] args) throws IllegalAccessException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootHelperApplication.class, args);
        TransformationController bean = applicationContext.getBean(TransformationController.class);
        System.out.println(bean);

        ResponseResult responseResult = bean.getAllDynamicValues();
        System.out.println(responseResult);


        // 获取Field字段来查看是否真实赋值成果
        TransformContext transformContext = applicationContext.getBean(TransformContext.class);
        List<TransformableValue> transformableValues = transformContext.get();
        for (TransformableValue transformableValue : transformableValues) {
            Field member = (Field) transformableValue.getMember();
            member.setAccessible(true);
            Object value = member.get(transformableValue.getBean());
            System.out.println(transformableValue.getKey() + "=" + String.valueOf(value));
        }

    }

}
