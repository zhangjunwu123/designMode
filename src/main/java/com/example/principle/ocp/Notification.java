package com.example.principle.ocp;

// 通知类 支持邮件、短信、微信、手机等多种通知渠道
public class Notification {

    // 通知
    void notify(NotificationEmergencyLevel level,String content) {
        // 略
    }


    // 表示通知的紧急程度，
    //包括 SEVERE（严重）、URGENCY（紧急）、NORMAL（普通）、TRIVIAL（无关紧要），不同的紧急程度对应不同的发送渠道
     enum NotificationEmergencyLevel {

        SEVERE(0,0),URGENCY(1,1),NORMAL(2,2),TRIVIAL(3,3);

        int channel ; //渠道
        int level; // 等级

        NotificationEmergencyLevel(int channel, int level) {
            this.channel = channel;
            this.level = level;
        }

        public int getChannel() {
            return channel;
        }

        public void setChannel(int channel) {
            this.channel = channel;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }
}
