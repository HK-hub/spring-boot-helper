package com.hk.helper.bean;

import com.hk.transformation.core.annotation.dynamic.DynamicSwitch;
import com.hk.transformation.core.annotation.dynamic.DynamicValue;
import com.hk.transformation.core.annotation.dynamic.IgnoreValue;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : HK意境
 * @ClassName : AllInOneTetBean
 * @date : 2023/9/18 17:32
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Component
// 动态属性类，表明其下的成员属性都将被声明为动态值对象
@DynamicValue
public class AllInOneTetBean {

    // ----------------------------基本类型及其包装类型----------------------------
    @DynamicValue(key = "baseTypeIntValue", defaultValue = "1000")
    private int anInt;

    @DynamicValue(key = "baseTypeLongValue", defaultValue = "111111111")
    private long longValue;

    @DynamicValue(key = "baseTypeDoubleValue", defaultValue = "1234525.767321")
    private double doubleValue;

    @DynamicValue(key = "baseTypeCharValue", defaultValue = "x")
    private char charValue;

    // ---------------------------动态开关-----------------------------------------
    @DynamicSwitch(key = "baseTypeBooleanValue", defaultValue = true)
    private boolean booleanValue;

    @DynamicSwitch(defaultValue = false)
    private boolean enableFeature;

    @DynamicSwitch
    private Boolean enableTransformation;


    // ----------------------------基本类型包装对象---------------------------------
    @DynamicValue(key = "wrapperTypeByteObject", defaultValue = "20")
    private Byte byteObject;

    @DynamicValue(key = "wrapperTypeShortObject", defaultValue = "30")
    private Short shortObject;


    // --------------------------------对象类型---------------------------
    @DynamicValue(key = "StringObject", defaultValue = "hello, transformation value!")
    private String stringValue;

    @DynamicValue(key = "NullValueStringObject")
    private String nullStringValue;

    @DynamicValue(key = "ObjectValue")
    private Object objectValue;

    @DynamicValue
    private AllInOneTetBean allInOneTetBean;


    // ----------------------------------数组类型--------------------------------
    @DynamicValue(key = "StringArray", defaultValue = "[a,b,c,bv,gregt,hethte.jy,hello,1,2,34,20]")
    private String[] stringArray;

    @DynamicValue(key = "IntegerArray", defaultValue = "[1,2,3,4,5,6,7,8,9]")
    private Integer[] integerArray;

    /**
     * 注意：此处如果确切需要char 类型的集合请使用如下两种形式进行初始化：
     * 方式一：a,b,c,d,e,f,g,h,i
     * 方式二：['a','b','c','d','e','f']
     * 因为他们将分别使用Spring ConverterService和Gson 进行转换成为Char数组。
     * 如果不按照这两种方式使用可能会造成field字段被初始化失败或者被初始化成为String[] 数组
     */
    @DynamicValue(key = "CharArray", defaultValue = "z,x,c,v,b,n,m,;,',=,*")
    private Character[] characterArray;

    @DynamicValue(key = "DoubleArray", defaultValue = "[12.14, 13.14, 520.13, 521.0, 1024.0]")
    private Double[] doubleArray;

    @DynamicValue(key = "IntSet", defaultValue = "[1,1,2,3,4,5,5,7,8]")
    private int[] intArray;

    @DynamicValue(key = "beanArray", defaultValue = "")
    private BaseTypeTestBean[] beans;


    // ----------------------------------集合类型--------------------------------
    @DynamicValue(key = "StringList", defaultValue = "[a,b,c,bv,gregt,hethte.jy,hello,1,2,34,20]")
    private List<String> stringList;

    @DynamicValue(key = "CharList", defaultValue = "['z','x','c','v','b','n','m',';','-','=','*']")
    private List<Character> characterList;

    @DynamicValue(key = "IntegerSet", defaultValue = "[1,1,2,3,4,5,5,7,8]")
    private Set<Integer> intSet;

    @DynamicValue(key = "StringSet", defaultValue = "[a,bc,d,e,f,g,g,g,f,a,z,x,我是HK,HK-hub,221384]")
    private Set<String> stringSet;


    // ----------------------------------多列集合类型--------------------------------
    @DynamicValue(key = "StringStringMap", defaultValue = "{k1:baaa, k2:bbbb, k3:ccc, k4:ddd, k5:1, k6:2, k7:3, k8:400.13}")
    private Map<String, String> stringStringMap;

    @DynamicValue(key = "StringIntegerMap", defaultValue = "{key1:100,key2:200,key3:600,key4:400}")
    private Map<String, Integer> stringIntegerMap;

    @DynamicValue(key = "StringListMap", defaultValue = "{hk:[12,13,14.07,16.87,543.77], hub:[12.3,87,45,4.87,64.8,6,4.5]}")
    private Map<String, List<Double>> stringListMap;


    // ----------------------------------匿名字段和忽略字段--------------------------------
    @DynamicValue
    private String[] testStringArray;

    // 忽略字段
    @IgnoreValue
    private Integer testInt;

    @DynamicValue(defaultValue = "[1,23,4,6,7,8,9,0,4365]")
    private List<Long> longList;

}
