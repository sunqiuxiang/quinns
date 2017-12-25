package org.pojo;

public class MdTasktable {
    private Integer id;

    private String depid;

    private String twUuid;

    private String auditor;

    private String applyname;

    private String deadline;

    private String twName;

    private String tzStaname;

    private String tzStype;

    private String twStarttime;

    private String remark;

    private String reviewed;

    private String applytime;

    private String filepath;

    private String allfilepath;

    private String flag;

    private String datasec;

    private String taizhen;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    public String getTwUuid() {
        return twUuid;
    }

    public void setTwUuid(String twUuid) {
        this.twUuid = twUuid == null ? null : twUuid.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getApplyname() {
        return applyname;
    }

    public void setApplyname(String applyname) {
        this.applyname = applyname == null ? null : applyname.trim();
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline == null ? null : deadline.trim();
    }

    public String getTwName() {
        return twName;
    }

    public void setTwName(String twName) {
        this.twName = twName == null ? null : twName.trim();
    }

    public String getTzStaname() {
        return tzStaname;
    }

    public void setTzStaname(String tzStaname) {
        this.tzStaname = tzStaname == null ? null : tzStaname.trim();
    }

    public String getTzStype() {
        return tzStype;
    }

    public void setTzStype(String tzStype) {
        this.tzStype = tzStype == null ? null : tzStype.trim();
    }

    public String getTwStarttime() {
        return twStarttime;
    }

    public void setTwStarttime(String twStarttime) {
        this.twStarttime = twStarttime == null ? null : twStarttime.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getReviewed() {
        return reviewed;
    }

    public void setReviewed(String reviewed) {
        this.reviewed = reviewed == null ? null : reviewed.trim();
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime == null ? null : applytime.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getAllfilepath() {
        return allfilepath;
    }

    public void setAllfilepath(String allfilepath) {
        this.allfilepath = allfilepath == null ? null : allfilepath.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getDatasec() {
        return datasec;
    }

    public void setDatasec(String datasec) {
        this.datasec = datasec == null ? null : datasec.trim();
    }

    public String getTaizhen() {
        return taizhen;
    }

    public void setTaizhen(String taizhen) {
        this.taizhen = taizhen == null ? null : taizhen.trim();
    }
}