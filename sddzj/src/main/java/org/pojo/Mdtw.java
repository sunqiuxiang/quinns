package org.pojo;

public class Mdtw {
    private String uuid;

    private String evtflag;

    private String type;

    private Integer doctype;

    private Integer stasum;

    private String twname;

    private Float lat;

    private Float lon;

    private Float hei;

    private String starttime;

    private Integer datasec;

    private String endtime;

    private String inDatetime;

    private Integer taizhen;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getEvtflag() {
        return evtflag;
    }

    public void setEvtflag(String evtflag) {
        this.evtflag = evtflag == null ? null : evtflag.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getDoctype() {
        return doctype;
    }

    public void setDoctype(Integer doctype) {
        this.doctype = doctype;
    }

    public Integer getStasum() {
        return stasum;
    }

    public void setStasum(Integer stasum) {
        this.stasum = stasum;
    }

    public String getTwname() {
        return twname;
    }

    public void setTwname(String twname) {
        this.twname = twname == null ? null : twname.trim();
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getHei() {
        return hei;
    }

    public void setHei(Float hei) {
        this.hei = hei;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public Integer getDatasec() {
        return datasec;
    }

    public void setDatasec(Integer datasec) {
        this.datasec = datasec;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getInDatetime() {
        return inDatetime;
    }

    public void setInDatetime(String inDatetime) {
        this.inDatetime = inDatetime == null ? null : inDatetime.trim();
    }

    public Integer getTaizhen() {
        return taizhen;
    }

    public void setTaizhen(Integer taizhen) {
        this.taizhen = taizhen;
    }
}