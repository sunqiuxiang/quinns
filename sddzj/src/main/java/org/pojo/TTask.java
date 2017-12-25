package org.pojo;

public class TTask {
    private Integer taskId;

    private Integer userId;

    private String monitor;

    private String parameter;

    private String timeStart;

    private String timeEnd;

    private String taskStatus;

    private String taskTimeStart;

    private String taskTimeEnd;

    private String taskStatusSpark;

    private String taskTimeStartSpark;

    private String taskTimeEndSpark;

    private String mubanPath;

    private String jarPath;

    private Integer reviewed;

    private String auditor;

    private String applytime;

    private String deadline;

    private Integer notice;

    private String checktime;

    private String taizhen;

    private String status;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor == null ? null : monitor.trim();
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart == null ? null : timeStart.trim();
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd == null ? null : timeEnd.trim();
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    public String getTaskTimeStart() {
        return taskTimeStart;
    }

    public void setTaskTimeStart(String taskTimeStart) {
        this.taskTimeStart = taskTimeStart == null ? null : taskTimeStart.trim();
    }

    public String getTaskTimeEnd() {
        return taskTimeEnd;
    }

    public void setTaskTimeEnd(String taskTimeEnd) {
        this.taskTimeEnd = taskTimeEnd == null ? null : taskTimeEnd.trim();
    }

    public String getTaskStatusSpark() {
        return taskStatusSpark;
    }

    public void setTaskStatusSpark(String taskStatusSpark) {
        this.taskStatusSpark = taskStatusSpark == null ? null : taskStatusSpark.trim();
    }

    public String getTaskTimeStartSpark() {
        return taskTimeStartSpark;
    }

    public void setTaskTimeStartSpark(String taskTimeStartSpark) {
        this.taskTimeStartSpark = taskTimeStartSpark == null ? null : taskTimeStartSpark.trim();
    }

    public String getTaskTimeEndSpark() {
        return taskTimeEndSpark;
    }

    public void setTaskTimeEndSpark(String taskTimeEndSpark) {
        this.taskTimeEndSpark = taskTimeEndSpark == null ? null : taskTimeEndSpark.trim();
    }

    public String getMubanPath() {
        return mubanPath;
    }

    public void setMubanPath(String mubanPath) {
        this.mubanPath = mubanPath == null ? null : mubanPath.trim();
    }

    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath == null ? null : jarPath.trim();
    }

    public Integer getReviewed() {
        return reviewed;
    }

    public void setReviewed(Integer reviewed) {
        this.reviewed = reviewed;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime == null ? null : applytime.trim();
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline == null ? null : deadline.trim();
    }

    public Integer getNotice() {
        return notice;
    }

    public void setNotice(Integer notice) {
        this.notice = notice;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public String getTaizhen() {
        return taizhen;
    }

    public void setTaizhen(String taizhen) {
        this.taizhen = taizhen == null ? null : taizhen.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}