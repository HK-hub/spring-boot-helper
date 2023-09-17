package com.hk.helper.bean;

import com.hk.transformation.core.annotation.dynamic.DynamicValue;
import com.hk.transformation.core.annotation.dynamic.IgnoreValue;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @author : HK意境
 * @ClassName : BaseTypeTestBean
 * @date : 2023/9/7 22:24
 * @description : 基本数据类型、包装类型、常见数据类型和时间相关数据类型
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Component
@DynamicValue
public class ClassTypeTestBean {


    private int anInt;


    private byte byteValue;


    private short shortValue;


    private long longValue;


    private float floatValue;


    private double doubleValue;


    private boolean booleanValue;

    private Byte byteObject;

    private Short shortObject;


    /**
     * 忽略该字段
     */
    @IgnoreValue
    private Integer intObject;


    private Long longObject;


    private Float floatObject;

    private Double doubleObject;


    /**
     * 忽略该字段
     */
    @IgnoreValue
    private List<Character> characterList;


    private List<Double> doubleList;

    private Set<Integer> intSet;


    private Set<String> stringSet;


}
