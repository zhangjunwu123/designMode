package com.example.util.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class GuavaCacheTest {


    @Test
    public void test1() throws ExecutionException {
        Cache<String, Object> cache = CacheBuilder.newBuilder().build();
        cache.put("name","ts");
        cache.put("age",18);

        Object name = cache.getIfPresent("addr");
        System.out.println(name);

        // get , load
        Object hobby = cache.get("hobby", () -> {
            System.out.println("callable execute");
            return "卷同事";
        });
        System.out.println(hobby);

        // invalidate cache
        cache.invalidate("age");
    }


    @Test
    public void test2() throws Exception {
        LoadingCache<String, Object> loadingCache = CacheBuilder.newBuilder()
                // 淘汰
                .expireAfterAccess(15, TimeUnit.SECONDS)// 缓存项在指定时间内没有读写操作则回收
                .maximumSize(5)
                .weakKeys()
                .softValues()
                // 刷新
                .refreshAfterWrite(10,TimeUnit.SECONDS)
                .build(new CacheLoader<String, Object>() {
            @Override
            public Object load(String key) throws Exception {
                // load data to cache
                System.out.println("cache loader execute");
                return "loaded cache is :" + key;
            }
        });

        // get-if-absent-compute
        Object name = loadingCache.get("name");
        System.out.println(name);
        loadingCache.getIfPresent("age");

        Object hobby = loadingCache.get("hobby", () -> {
            return "卷同事";
        });
        System.out.println(hobby);

        loadingCache.put("age","18");
        TimeUnit.SECONDS.sleep(16);
        Object age = loadingCache.get("age");
        System.out.println(age);
    }
}
