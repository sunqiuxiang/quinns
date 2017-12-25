package org.pojo;

import java.util.Date;

public class Tztw {
    private String name;

    private String namev;

    private String uploadpath;

    private String uuid;

    private String staname;

    private Integer taizhen;

    private String twname;

    private String datype;

    private Integer samp;

    private String stype;

    private Date starttime;

    private Date endtime;

    private Integer datasec;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNamev() {
        return namev;
    }

    public void setNamev(String namev) {
        this.namev = namev == null ? null : namev.trim();
    }

    public String getUploadpath() {
        return uploadpath;
    }

    public void setUploadpath(String uploadpath) {
        this.uploadpath = uploadpath == null ? null : uploadpath.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getStaname() {
        return staname;
    }

    public void setStaname(String staname) {
        this.staname = staname == null ? null : staname.trim();
    }

    public Integer getTaizhen() {
        return taizhen;
    }

    public void setTaizhen(Integer taizhen) {
        this.taizhen = taizhen;
    }

    public String getTwname() {
        return twname;
    }

    public void setTwname(String twname) {
        this.twname = twname == null ? null : twname.trim();
    }

    public String getDatype() {
        return datype;
    }

    public void setDatype(String datype) {
        this.datype = datype == null ? null : datype.trim();
    }

    public Integer getSamp() {
        return samp;
    }

    public void setSamp(Integer samp) {
        this.samp = samp;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getDatasec() {
        return datasec;
    }

    public void setDatasec(Integer datasec) {
        this.datasec = datasec;
    }
}