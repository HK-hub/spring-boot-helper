package com.hk.helper.bean;

import com.hk.transformation.core.annotation.dynamic.DynamicValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author : HK意境
 * @ClassName : MapTypeTestBean
 * @date : 2023/9/11 21:31
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Slf4j
@Component
public class MapTypeTestBean {


    @DynamicValue(key = "StringStringMap", defaultValue = "{k1:baaa, k2:bbbb, k3:ccc, k4:ddd, k5:1, k6:2, k7:3, k8:400.13}")
    private Map<String, String> stringStringMap;

    @DynamicValue(key = "StringIntegerMap", defaultValue = "{key1:100,key2:200,key3:600,key4:400}")
    private Map<String, Integer> stringIntegerMap;

    @DynamicValue(key = "StringListMap", defaultValue = "{hk:[12,13,14.07,16.87,543.77], hub:[12.3,87,45,4.87,64.8,6,4.5]}")
    private Map<String, List<Double>> stringListMap;

}
