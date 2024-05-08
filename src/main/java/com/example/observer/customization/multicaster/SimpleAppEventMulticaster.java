package com.example.observer.customization.multicaster;

import com.example.observer.customization.event.AppEvent;
import com.example.observer.customization.listener.AppListener;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SimpleAppEventMulticaster extends AbstractAppEventMulticaster{

    private Executor executor = new ThreadPoolExecutor(
            5,
            10,
            60,
            TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(100)
    );

    @Override
    public void multicasterEvent(AppEvent event) {
        // 1,找到对该事件感兴趣的监听器, 2,依次回调
        for (AppListener listener : getAppListeners(event)) {
            if (executor!=null) {
                executor.execute(()->{
                    invokeListener(listener,event);
                });
            }else {
                invokeListener(listener,event);
            }
        }
    }

    private void invokeListener(AppListener listener, AppEvent event) {
        try {
            listener.onAppEvent(event);
        } catch (Exception e) {
            e.printStackTrace();
            //////////.........不同的异常处理机制
        }
    }
}
