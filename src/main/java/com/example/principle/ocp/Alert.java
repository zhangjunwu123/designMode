package com.example.principle.ocp;

import java.util.ArrayList;
import java.util.List;

// 告警类
public class Alert {


  /*  private AlertRule rule;
    private Notification notification;

    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }*/

   /* public void adaptiveAlert(String api,long requstCount,long errorCount,long durationOfSeconds,long timeoutCount) {
        // tps
        long tps = requstCount / durationOfSeconds;
        if (tps > rule.getMatchedRule(api).getMaxTps()) {
            notification.notify(Notification.NotificationEmergencyLevel.URGENCY,".........");
        }
        // errorcout
        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(Notification.NotificationEmergencyLevel.URGENCY,"........");
        }

        // add timeoutCount logic
        *//*
         * 问题：添加一个超时处理逻辑
         *//*
        if (timeoutCount > 1) {
            //................
        }


    }*/


    private List<AlertHandler> handlers = new ArrayList<>();

    public void addHandler(AlertHandler alertHandler) {
        handlers.add(alertHandler);
    }

    public void adaptiveAlert(ApiInfo apiInfo) {
        for (AlertHandler handler : handlers) {
            handler.adaptiveAlert(apiInfo);
        }
    }

}