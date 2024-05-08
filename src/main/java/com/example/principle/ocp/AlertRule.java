package com.example.principle.ocp;

// 存储告警规则
public class AlertRule {


    public MatchRule getMatchedRule(String api) {
        return null;
    }

    class MatchRule {

        long maxTps;
        long maxErrorCount;

        //...... Maxtimeout


        public long getMaxTps() {
            return maxTps;
        }

        public void setMaxTps(long maxTps) {
            this.maxTps = maxTps;
        }

        public long getMaxErrorCount() {
            return maxErrorCount;
        }

        public void setMaxErrorCount(long maxErrorCount) {
            this.maxErrorCount = maxErrorCount;
        }
    }
}
