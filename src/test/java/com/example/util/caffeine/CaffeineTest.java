package com.example.util.caffeine;

import com.github.benmanes.caffeine.cache.AsyncLoadingCache;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import com.google.common.collect.Lists;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.junit.Test;

import java.util.Map;
import java.util.concurrent.*;

public class CaffeineTest {

    @Test
    public void testManual() {
        Cache<String, String> cache = Caffeine.newBuilder()
                .expireAfterAccess(30, TimeUnit.SECONDS)
                .maximumSize(100)
                .build();

        // lookup
        String name = cache.getIfPresent("name");
        System.out.println(name);

        String name1 = cache.get("name", (key) -> {
            System.out.println("load value by key :" + key);
            return "value:" + key;
        });
        System.out.println(name1);

        // put
        cache.put("age","18");

        // invalidate
        cache.invalidate("age");
    }


    @Test
    public void testLoading() {
        LoadingCache<String, String> loadingCache = Caffeine.newBuilder()
                .maximumSize(100)
                .expireAfterAccess(30, TimeUnit.SECONDS)
                .refreshAfterWrite(15, TimeUnit.SECONDS)
                .build((key) -> {
                    System.out.println("load value by key :" + key);
                    return "value:" + key;
                });

        String name = loadingCache.get("name");
        Map<@NonNull String, @NonNull String> hobby = loadingCache.getAll(Lists.newArrayList("hobby","address"));
        System.out.println(name);
        System.out.println(hobby);

    }


    @Test
    public void testAsynchronouslyLoading() throws Exception{

        Executor executor = new ThreadPoolExecutor(5,10,60,TimeUnit.SECONDS,new LinkedBlockingQueue<>(100));

        AsyncLoadingCache<String, String> cache = Caffeine.newBuilder()
                .maximumSize(10_000)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .executor(executor) // default is ForkJoinPool.commonPool()
                // Either: Build with a synchronous computation that is wrapped as asynchronous
                .buildAsync( key -> {
                    System.out.println(Thread.currentThread().getName() + " load value by key :" + key);
                    return "value:" + key;
                });
                // Or: Build with a asynchronous computation that returns a future
                //.buildAsync((key, executor) -> createExpensiveGraphAsync(key, executor));

        CompletableFuture<String> name = cache.get("name");
        System.out.println(name.get());
    }
}
