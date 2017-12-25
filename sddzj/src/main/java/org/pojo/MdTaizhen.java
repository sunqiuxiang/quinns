package org.pojo;

public class MdTaizhen {
    private Integer id;

    private String name;

    private String uploadpath;

    private String namev;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUploadpath() {
        return uploadpath;
    }

    public void setUploadpath(String uploadpath) {
        this.uploadpath = uploadpath == null ? null : uploadpath.trim();
    }

    public String getNamev() {
        return namev;
    }

    public void setNamev(String namev) {
        this.namev = namev == null ? null : namev.trim();
    }
}