package org.pojo;

public class DzjConstant {
    private Integer id;

    private Integer role;

    private Integer powerlevel;

    private String rolename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getPowerlevel() {
        return powerlevel;
    }

    public void setPowerlevel(Integer powerlevel) {
        this.powerlevel = powerlevel;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }
}