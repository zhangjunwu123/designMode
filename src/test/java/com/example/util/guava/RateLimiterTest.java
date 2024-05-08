package com.example.util.guava;

import com.google.common.util.concurrent.RateLimiter;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class RateLimiterTest {


    @Test
    public void testSmoothBursty() throws Exception{
        // permitsPerSecond 每秒许可数
        RateLimiter rateLimiter = RateLimiter.create(5);
        int i = 0;
       // TimeUnit.SECONDS.sleep(5);
        while (true) {
            double acquireTime = rateLimiter.acquire();
            System.out.printf("获取到第 %d 个 令牌,时间: %s \n",++i,acquireTime);
        }
    }


    @Test
    public void testSmoothWarmingUp() {
        // warmupPeriod 预热期
        RateLimiter rateLimiter = RateLimiter.create(5, 5, TimeUnit.SECONDS);
        int i = 0;
        // TimeUnit.SECONDS.sleep(5);
        while (true) {
            double acquireTime = rateLimiter.acquire();
            System.out.printf("获取到第 %d 个 令牌,时间: %s \n",++i,acquireTime);
        }
    }
}
