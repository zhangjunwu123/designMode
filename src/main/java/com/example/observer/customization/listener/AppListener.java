package com.example.observer.customization.listener;

import com.example.observer.customization.event.AppEvent;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EventListener;

/**
 * 应用事件监听器接口
 */
public interface AppListener<E extends AppEvent> extends EventListener {

    void onAppEvent(E event);

    default boolean supportEventType(Class eventType){
        Type[] genericInterfaces = this.getClass().getGenericInterfaces();
        if (genericInterfaces.getClass().isAssignableFrom(ParameterizedType[].class)) {
            for (Type genericInterface : genericInterfaces) {
                ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Type type = actualTypeArguments[0];
                if (type instanceof Class) {
                    Class clazz = (Class) type;
                    return clazz==eventType;
                }
            }
        }
        return false;
    }

    default boolean supportSourceType(Class sourceType) {
        return true;
    }
}
