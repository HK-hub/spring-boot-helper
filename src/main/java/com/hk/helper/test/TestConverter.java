package com.hk.helper.test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author : HK意境
 * @ClassName : TestConverter
 * @date : 2023/9/11 19:57
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
public class TestConverter {

    private static final Gson gson = new Gson();


    @Test
    public void testCollectionConverter() throws Exception {

        Type type = new TypeToken<List<Character>>() {

        }.getType();
        Object object = gson.fromJson("{a,b,c,d,5,6}", type);
        System.out.println(object);
    }

    @Test
    public void testCharCollectionConverter() throws Exception {

        Class<? super List<Character>> rawType = new TypeToken<List<Character>>() {

        }.getRawType();

        Object object = gson.fromJson("['a','b','c']", rawType);
        System.out.println(object);
    }






}
