package com.hk.helper.listener;

import com.hk.transformation.core.annotation.observation.DynamicObserver;
import com.hk.transformation.core.listen.observation.observer.TransformableObserver;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : HK意境
 * @ClassName : BaseValueChangeListener
 * @date : 2023/9/17 21:41
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@Slf4j
@DynamicObserver(key = "baseTypeIntValue")
public class BaseValueChangeListener implements TransformableObserver<Integer> {

    /**
     * 监听动态值变化
     * @param oldValue
     * @param newValue
     */
    @Override
    public void update(String key, Integer oldValue, Integer newValue) {
        log.info("key={}, value has changed:old={}, new={}", "baseTypeIntValue", oldValue, newValue);
    }
}
