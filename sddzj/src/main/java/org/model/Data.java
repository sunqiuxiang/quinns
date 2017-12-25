package org.model;
import java.util.ArrayList;

public class Data {

	// 台站编号
	private int staid;

	public void setStaid(int staid) {
		this.staid = staid;
	}

	public int getStaid() {
		return this.staid;
	}

	// 台站名称
	private String staname;

	public void setStaName(String staname) {
		this.staname = staname;
	}

	public String getStaName() {
		return this.staname;
	}

	// 数采型号
	private String DAtype;

	public void setDAtype(String DAtype) {
		this.DAtype = DAtype;
	}

	public String getDAtype() {
		return this.DAtype;
	}

	// 数采字长
	private int DAlen;

	public void setDAlen(int DAlen) {
		this.DAlen = DAlen;
	}

	public int getDAlen() {
		return this.DAlen;
	}

	// 采样率
	private int samp;

	public void setSamp(int samp) {
		this.samp = samp;
	}

	public int getSamp() {
		return this.samp;
	}

	// 台站经度
	private float stalon;

	public void setStalon(float stalon) {
		this.stalon = stalon;
	}

	public float getStalon() {
		return this.stalon;
	}

	// 台站纬度
	private float stalat;

	public void setStalat(float stalat) {
		this.stalat = stalat;
	}

	public float getStalat() {
		return this.stalat;
	}

	// 台站高程
	private float stahei;

	public void setStahei(float stahei) {
		this.stahei = stahei;
	}

	public float getStahei() {
		return this.stahei;
	}

	private int ncid;
	private int ecid;
	private int ucid;
	public int getNcid() {
		return ncid;
	}

	public void setNcid(int ncid) {
		this.ncid = ncid;
	}

	public int getEcid() {
		return ecid;
	}

	public void setEcid(int ecid) {
		this.ecid = ecid;
	}

	public int getUcid() {
		return ucid;
	}

	public void setUcid(int ucid) {
		this.ucid = ucid;
	}

	private String ncname;
	private String ecname;
	private String ucname;

	public String getNcname() {
		return ncname;
	}

	public void setNcname(String ncname) {
		this.ncname = ncname;
	}

	public String getEcname() {
		return ecname;
	}

	public void setEcname(String ecname) {
		this.ecname = ecname;
	}

	public String getUcname() {
		return ucname;
	}

	public void setUcname(String ucname) {
		this.ucname = ucname;
	}

	// 东西向响应阶数
	private int edgree;

	public int getEdgree() {
		return edgree;
	}

	public void setEdgree(int edgree) {
		this.edgree = edgree;
	}

	public float getUdgree() {
		return udgree;
	}

	public void setUdgree(int udgree) {
		this.udgree = udgree;
	}

	public float getNdgree() {
		return ndgree;
	}

	public void setNdgree(int ndgree) {
		this.ndgree = ndgree;
	}

	// 垂直向响应阶数
	private int udgree;

	// 北南向响应阶数
	private int ndgree;

	// 东西向增益因子
	private float efactor;

	public void setEfactor(float efactor) {
		this.efactor = efactor;
	}

	public float getEfcator() {
		return this.efactor;
	}

	// 垂直向增益因子
	private float ufactor;

	public void setUfactor(float ufactor) {
		this.ufactor = ufactor;
	}

	public float getUfcator() {
		return this.ufactor;
	}

	// 北南向增益因子
	private float nfactor;

	public void setNfactor(float nfactor) {
		this.nfactor = nfactor;
	}

	public float getNfcator() {
		return this.nfactor;
	}

	@SuppressWarnings("unchecked")
	public
	ArrayList u = new ArrayList();

	public void setUdata(double udata) {
		this.u.add(udata);
	}

	public ArrayList getUdata() {
		return this.u;
	}

	public ArrayList e = new ArrayList();

	public void setEdata(double edata) {
		this.e.add(edata);
	}

	public ArrayList getEdata() {
		return this.e;
	}

	public ArrayList n = new ArrayList();

	public void setNdata(double ndata) {
		this.n.add(ndata);
	}

	public ArrayList getNdata() {
		return this.n;
	}

}
