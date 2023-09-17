package com.hk.helper.bean;

import com.hk.transformation.core.annotation.dynamic.DynamicValue;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : HK意境
 * @ClassName : AnonymousTypeTestBean
 * @date : 2023/9/16 22:35
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Component
public class AnonymousTypeTestBean {


    @DynamicValue
    private String[] testStirngArray[];

    @DynamicValue
    private Integer testInt;

    @DynamicValue(defaultValue = "[1,23,4,6,7,8,9,0,4365]")
    private List<Long> longList;


}
