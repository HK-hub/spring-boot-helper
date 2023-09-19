package com.hk.helper.bean;

import com.hk.transformation.core.annotation.dynamic.DynamicSwitch;
import org.springframework.stereotype.Component;

/**
 * @author : HK意境
 * @ClassName : SwitchTypeTestBean
 * @date : 2023/9/18 17:59
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Component
public class SwitchTypeTestBean {

    @DynamicSwitch(key = "baseTypeBooleanValue", defaultValue = true)
    private boolean booleanValue;

    @DynamicSwitch(defaultValue = false)
    private boolean enableFeature;

    @DynamicSwitch
    private Boolean enableTransformation;

}
