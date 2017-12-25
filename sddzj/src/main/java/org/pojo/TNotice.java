package org.pojo;

public class TNotice {
    private String uuid;

    private String noticeTitle;

    private String noticeContent;

    private String noticeStartTime;

    private String noticeEndTime;

    private Integer noticeStatus;

    private String noticeCreater;

    private Integer dzjUserId;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }

    public String getNoticeStartTime() {
        return noticeStartTime;
    }

    public void setNoticeStartTime(String noticeStartTime) {
        this.noticeStartTime = noticeStartTime == null ? null : noticeStartTime.trim();
    }

    public String getNoticeEndTime() {
        return noticeEndTime;
    }

    public void setNoticeEndTime(String noticeEndTime) {
        this.noticeEndTime = noticeEndTime == null ? null : noticeEndTime.trim();
    }

    public Integer getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public String getNoticeCreater() {
        return noticeCreater;
    }

    public void setNoticeCreater(String noticeCreater) {
        this.noticeCreater = noticeCreater == null ? null : noticeCreater.trim();
    }

    public Integer getDzjUserId() {
        return dzjUserId;
    }

    public void setDzjUserId(Integer dzjUserId) {
        this.dzjUserId = dzjUserId;
    }
}