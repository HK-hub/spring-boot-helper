package com.hk.helper.bean;

import com.hk.transformation.core.annotation.dynamic.DynamicValue;
import org.springframework.stereotype.Component;

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
public class BaseTypeTestBean {

    @DynamicValue(key = "baseTypeIntValue", defaultValue = "1000")
    private int anInt;

    @DynamicValue(key = "baseTypeByteValue", defaultValue = "120")
    private byte byteValue;

    @DynamicValue(key = "baseTypeShortValue", defaultValue = "520")
    private short shortValue;

    @DynamicValue(key = "baseTypeLongValue", defaultValue = "111111111")
    private long longValue;

    @DynamicValue(key = "baseTypeFloatValue", defaultValue = "1314.520")
    private float floatValue;

    @DynamicValue(key = "baseTypeDoubleValue", defaultValue = "1234525.767321")
    private double doubleValue;

    @DynamicValue(key = "baseTypeCharValue", defaultValue = "x")
    private char charValue;

    @DynamicValue(key = "baseTypeBooleanValue")
    private boolean booleanValue;

    @DynamicValue(key = "wrapperTypeByteObject", defaultValue = "20")
    private Byte byteObject;

    @DynamicValue(key = "wrapperTypeShortObject", defaultValue = "30")
    private Short shortObject;

    @DynamicValue(key = "wrapperTypeIntObject", defaultValue = "432895482")
    private Integer intObject;

    @DynamicValue(key = "wrapperTypeLongObject", defaultValue = "548357893276595674")
    private Long longObject;

    @DynamicValue(key = "wrapperTyeFloatObject", defaultValue = "328.654678")
    private Float floatObject;

    @DynamicValue(key = "wrapperTypeDoubleObject")
    private Double doubleObject;

    @DynamicValue(key = "wrapperTypeChatObject", defaultValue = "D")
    private Character charObject;

    @DynamicValue(key = "wrapperTypeBooleanObject", defaultValue = "false")
    private Boolean booleanObject;

    @DynamicValue(key = "StringObject", defaultValue = "hello, transformation value!")
    private String stringValue;

    @DynamicValue(key = "NullValueStringObject")
    private String nullStringValue;

    public BaseTypeTestBean() {

    }


}
