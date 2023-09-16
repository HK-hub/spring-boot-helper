package com.hk.helper.bean;

import com.hk.transformation.core.annotation.dynamic.DynamicValue;
import org.springframework.stereotype.Component;

/**
 * @author : HK意境
 * @ClassName : ArrayTypeTestBean
 * @date : 2023/9/12 22:54
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Component
public class ArrayTypeTestBean {

    @DynamicValue(key = "StringArray", defaultValue = "[a,b,c,bv,gregt,hethte.jy,hello,1,2,34,20]")
    private String[] stringList;

    @DynamicValue(key = "IntegerArray", defaultValue = "[1,2,3,4,5,6,7,8,9]")
    private Integer[] intList;

    @DynamicValue(key = "LongArray", defaultValue = "[100,2000,3000,4000,5000,6000]")
    private Long[] longList;

    /**
     * TODO 存在[ 和 ] 的问题
     */
    @DynamicValue(key = "CharArray", defaultValue = "z,x,c,v,b,n,m,;,',=,*")
    private Character[] characterList;

    @DynamicValue(key = "DoubleArray", defaultValue = "[12.14, 13.14, 520.13, 521.0, 1024.0]")
    private Double[] doubleList;

    @DynamicValue(key = "IntSet", defaultValue = "[1,1,2,3,4,5,5,7,8]")
    private int[] intArray;


    @DynamicValue(key = "beanArray", defaultValue = "")
    private BaseTypeTestBean[] beans;


}
