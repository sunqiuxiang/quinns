package org.pojo;

public class MdFilepath {
    private String tzUuid;

    private String filetype;

    private String filepath;

    public String getTzUuid() {
        return tzUuid;
    }

    public void setTzUuid(String tzUuid) {
        this.tzUuid = tzUuid == null ? null : tzUuid.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }
}