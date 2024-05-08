package com.example.observer.customization.multicaster;

import com.example.observer.customization.event.AppEvent;
import com.example.observer.customization.listener.AppListener;

/**
 * 事件广播器
 */
public interface AppEventMulticaster {

    /**
     * 添加监听器
     * @param listener
     */
    void addAppListener(AppListener<?> listener);

    /**
     * 广播事件给对应的监听器
     * @param event
     */
    void multicasterEvent(AppEvent event);
}
