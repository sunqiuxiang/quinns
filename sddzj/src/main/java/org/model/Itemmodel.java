package org.model;

import java.util.List;

public class Itemmodel {
	public int id;
	public int childflag;
	public List<Itemmodel> child;
	public String funcname;
	public String funcpath;
	public String funcicon;
//	public String url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFuncname() {
		return funcname;
	}
	public void setFuncname(String funcname) {
		this.funcname = funcname;
	}
	public String getFuncpath() {
		return funcpath;
	}
	public void setFuncpath(String funcpath) {
		this.funcpath = funcpath;
	}
	public String getFuncicon() {
		return funcicon;
	}
	public void setFuncicon(String funcicon) {
		this.funcicon = funcicon;
	}
	public List<Itemmodel> getChild() {
		return child;
	}
	public void setChild(List<Itemmodel> child) {
		this.child = child;
	}
	public int getChildflag() {
		return childflag;
	}
	public void setChildflag(int childflag) {
		this.childflag = childflag;
	}

	
	
	
}
