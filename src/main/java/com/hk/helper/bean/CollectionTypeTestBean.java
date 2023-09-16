package com.hk.helper.bean;

import com.hk.transformation.core.annotation.dynamic.DynamicValue;
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
public class CollectionTypeTestBean {


    @DynamicValue(key = "StringList", defaultValue = "[a,b,c,bv,gregt,hethte.jy,hello,1,2,34,20]")
    private List<String> stringList;

    @DynamicValue(key = "IntegerList", defaultValue = "[1,2,3,4,5,6,7,8,9]")
    private List<Integer> intList;

    @DynamicValue(key = "LongList", defaultValue = "[100,2000,3000,4000,5000,6000]")
    private List<Long> longList;

    /**
     * TODO 存在[ 和 ] 的问题
     */
    @DynamicValue(key = "CharList", defaultValue = "['z','x','c','v','b','n','m',';','-','=','*']")
    private List<Character> characterList;

    @DynamicValue(key = "DoubleList", defaultValue = "[12.14, 13.14, 520.13, 521.0, 1024.0]")
    private List<Double> doubleList;

    @DynamicValue(key = "IntegerSet", defaultValue = "[1,1,2,3,4,5,5,7,8]")
    private Set<Integer> intSet;


    @DynamicValue(key = "StringSet", defaultValue = "[a,bc,d,e,f,g,g,g,f,a,z,x,我是HK,HK-hub,221384]")
    private Set<String> stringSet;

}
