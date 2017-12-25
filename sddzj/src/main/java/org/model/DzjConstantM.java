package org.model;

public class DzjConstantM {
    private Integer id;

    private String role;

    private Integer powerlevel;

    private String rolename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
	    return role;
    }
   	public void setRole(String role) {
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