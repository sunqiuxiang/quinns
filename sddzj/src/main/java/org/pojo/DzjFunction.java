package org.pojo;

public class DzjFunction {
    private Integer id;

    private String funcname;

    private Integer funcpower;

    private String funcchild;

    private String funcpath;

    private String funcicon;

    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuncname() {
        return funcname;
    }

    public void setFuncname(String funcname) {
        this.funcname = funcname == null ? null : funcname.trim();
    }

    public Integer getFuncpower() {
        return funcpower;
    }

    public void setFuncpower(Integer funcpower) {
        this.funcpower = funcpower;
    }

    public String getFuncchild() {
        return funcchild;
    }

    public void setFuncchild(String funcchild) {
        this.funcchild = funcchild == null ? null : funcchild.trim();
    }

    public String getFuncpath() {
        return funcpath;
    }

    public void setFuncpath(String funcpath) {
        this.funcpath = funcpath == null ? null : funcpath.trim();
    }

    public String getFuncicon() {
        return funcicon;
    }

    public void setFuncicon(String funcicon) {
        this.funcicon = funcicon == null ? null : funcicon.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}