package org.pojo;

import java.util.Date;

public class MdMonitor {
    private String hostname;

    private String ip;

    private String cpuUsage;

    private Float memTotal;

    private Float memUsed;

    private String memUsage;

    private Float diskTotal;

    private Float diskUsed;

    private String diskUsage;

    private Date updateTime;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage == null ? null : cpuUsage.trim();
    }

    public Float getMemTotal() {
        return memTotal;
    }

    public void setMemTotal(Float memTotal) {
        this.memTotal = memTotal;
    }

    public Float getMemUsed() {
        return memUsed;
    }

    public void setMemUsed(Float memUsed) {
        this.memUsed = memUsed;
    }

    public String getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(String memUsage) {
        this.memUsage = memUsage == null ? null : memUsage.trim();
    }

    public Float getDiskTotal() {
        return diskTotal;
    }

    public void setDiskTotal(Float diskTotal) {
        this.diskTotal = diskTotal;
    }

    public Float getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(Float diskUsed) {
        this.diskUsed = diskUsed;
    }

    public String getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(String diskUsage) {
        this.diskUsage = diskUsage == null ? null : diskUsage.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}