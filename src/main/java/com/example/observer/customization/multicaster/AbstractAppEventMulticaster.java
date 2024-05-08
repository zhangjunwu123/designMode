package com.example.observer.customization.multicaster;

import com.example.observer.customization.event.AppEvent;
import com.example.observer.customization.listener.AppListener;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractAppEventMulticaster implements AppEventMulticaster {

    private final ListenerHelper defaultHelper = new ListenerHelper();

    protected final Map<ListenerCacheKey,ListenerHelper> helperCache = new ConcurrentHashMap(64);

    @Override
    public void addAppListener(AppListener<?> listener) {
        defaultHelper.appListeners.add(listener);
    }


    /**
     * 根据事件返回对应的监听器集合
     * @param event
     * @return
     */
    protected Collection<AppListener<?>>  getAppListeners(AppEvent event){
        Object source = event.getSource();
        Class sourceType = source==null? null:source.getClass();
        ListenerCacheKey cacheKey = new ListenerCacheKey(event.getClass(),sourceType);
        ListenerHelper helper = helperCache.get(cacheKey);
        if (helper!=null) {
            return helper.getAppListeners();
        }else {
            // search defaultHelper
            helper = new ListenerHelper();
            Collection<AppListener<?>> listeners = getAppListeners(event.getClass(),sourceType,helper);
            helperCache.put(cacheKey,helper);
            return listeners;
        }
    }

    /**
     * 根据 eventType sourceType 从 defaultHelper中找到对应的listener集合，填充给helper并且返回
     * @param eventType
     * @param sourceType
     * @param helper
     * @return
     */
    private Collection<AppListener<?>> getAppListeners(Class eventType, Class sourceType, ListenerHelper helper) {
        Collection<AppListener<? extends AppEvent>> allListeners = defaultHelper.getAppListeners();
        List<AppListener<?>> returns = new ArrayList<>();
        for (AppListener<?> listener : allListeners) {
            if(supportEvent(listener,eventType,sourceType)) {
                if (helper!=null) {
                    helper.appListeners.add(listener);
                }
                returns.add(listener);
            }
        }
        return returns;
    }

    private boolean supportEvent(AppListener<?> listener, Class eventType, Class sourceType) {
        return listener.supportEventType(eventType) && listener.supportSourceType(sourceType);
    }


    private class ListenerCacheKey {

        private final Class eventType;
        private final Class sourceType;

        public ListenerCacheKey(Class eventType,Class sourceType) {
            this.eventType = eventType;
            this.sourceType = sourceType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListenerCacheKey cacheKey = (ListenerCacheKey) o;
            return Objects.equals(eventType, cacheKey.eventType) && Objects.equals(sourceType, cacheKey.sourceType);
        }

        @Override
        public int hashCode() {
            return Objects.hash(eventType, sourceType);
        }

        @Override
        public String toString() {
            return "ListenerCacheKey{" +
                    "eventType=" + eventType +
                    ", sourceType=" + sourceType +
                    '}';
        }
    }


   private class ListenerHelper {

        private final Set<AppListener<? extends AppEvent>> appListeners = new LinkedHashSet<>();


        public Collection<AppListener<? extends AppEvent>> getAppListeners() {
            List<AppListener<? extends AppEvent>> allListeners  = new ArrayList<>(appListeners.size());
            allListeners.addAll(appListeners);
            return allListeners;
        }

   }



}
