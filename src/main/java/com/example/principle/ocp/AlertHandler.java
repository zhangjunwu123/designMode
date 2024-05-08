package com.example.principle.ocp;

public abstract class AlertHandler {

    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }


    public abstract void adaptiveAlert(ApiInfo apiInfo);
}

class TpsAlertHandler extends AlertHandler {

    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void adaptiveAlert(ApiInfo apiInfo) {
        long tps = apiInfo.getRequestCount() / apiInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiInfo.getApi()).getMaxTps()) {
            notification.notify(Notification.NotificationEmergencyLevel.URGENCY,".........");
        }
    }
}

class ErrorCountAlertHandler extends AlertHandler{

    public ErrorCountAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void adaptiveAlert(ApiInfo apiInfo) {
        if (apiInfo.getErrorCount() > rule.getMatchedRule(apiInfo.getApi()).getMaxErrorCount()) {
            notification.notify(Notification.NotificationEmergencyLevel.URGENCY,"........");
        }
    }
}


class TimeoutAlertHandler extends AlertHandler {

    public TimeoutAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void adaptiveAlert(ApiInfo apiInfo) {

    }
}
