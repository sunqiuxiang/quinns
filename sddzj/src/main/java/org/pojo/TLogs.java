package org.pojo;

public class TLogs {
    private String logTime;

    private String event;

    private String eventProducer;

    private String eventCustomer;

    private Integer remark01;

    private String remark02;

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime == null ? null : logTime.trim();
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
    }

    public String getEventProducer() {
        return eventProducer;
    }

    public void setEventProducer(String eventProducer) {
        this.eventProducer = eventProducer == null ? null : eventProducer.trim();
    }

    public String getEventCustomer() {
        return eventCustomer;
    }

    public void setEventCustomer(String eventCustomer) {
        this.eventCustomer = eventCustomer == null ? null : eventCustomer.trim();
    }

    public Integer getRemark01() {
        return remark01;
    }

    public void setRemark01(Integer remark01) {
        this.remark01 = remark01;
    }

    public String getRemark02() {
        return remark02;
    }

    public void setRemark02(String remark02) {
        this.remark02 = remark02 == null ? null : remark02.trim();
    }
}