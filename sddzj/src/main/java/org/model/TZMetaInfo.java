package org.model;

public class TZMetaInfo {
	private int staid;
	private String staName;
	private String DAtype;
	private int DAlen;
	private float v;
	private int samp;
	private int stacom;
	private int bc;
	private String tp;
	private int checkTime;
	private String timeType;
	private float subTime;
	private float stalat;
	private float stalon;
	private float shei;
	private int swei;
	private int vmol;
	private int dmol;
	private String stype;
	private float egfactor;
	private float ngfactor;
	private float ugfactor;
	private int edgree;
	private int ndgree;
	private int udgree;
	private String ncname;
	private String ecname;
	private String ucname;
	private int ncid;
	private int ecid;
	private int ucid;
	public TZMetaInfo() {}
	
	public TZMetaInfo(int staid, String staName, String dAtype, int dAlen, float v, int samp, int stacom, int bc,
			String tp, int checkTime, String timeType, float subTime, float stalat, float stalon, float shei, int swei,
			int vmol, int dmol, String stype, float egfactor, float ngfactor, float ugfactor, int edgree, int ndgree,
			int udgree, String ncname, String ecname, String ucname, int ncid, int ecid, int ucid) {
		super();
		this.staid = staid;
		this.staName = staName.trim();
		DAtype = dAtype.trim();
		DAlen = dAlen;
		this.v = v;
		this.samp = samp;
		this.stacom = stacom;
		this.bc = bc;
		this.tp = tp.trim();
		this.checkTime = checkTime;
		this.timeType = timeType.trim();
		this.subTime = subTime;
		this.stalat = stalat;
		this.stalon = stalon;
		this.shei = shei;
		this.swei = swei;
		this.vmol = vmol;
		this.dmol = dmol;
		this.stype = stype.trim();
		this.egfactor = egfactor;
		this.ngfactor = ngfactor;
		this.ugfactor = ugfactor;
		this.edgree = edgree;
		this.ndgree = ndgree;
		this.udgree = udgree;
		this.ncname = ncname.trim();
		this.ecname = ecname.trim();
		this.ucname = ucname.trim();
		this.ncid = ncid;
		this.ecid = ecid;
		this.ucid = ucid;
	}
	public int getStaid() {
		return staid;
	}
	public void setStaid(int staid) {
		this.staid = staid;
	}
	public String getStaName() {
		return staName;
	}
	public void setStaName(String staName) {
		this.staName = staName.trim();
	}
	public String getDAtype() {
		return DAtype;
	}
	public void setDAtype(String dAtype) {
		DAtype = dAtype.trim();
	}
	public int getDAlen() {
		return DAlen;
	}
	public void setDAlen(int dAlen) {
		DAlen = dAlen;
	}
	public float getV() {
		return v;
	}
	public void setV(float v) {
		this.v = v;
	}
	public int getSamp() {
		return samp;
	}
	public void setSamp(int samp) {
		this.samp = samp;
	}
	public int getStacom() {
		return stacom;
	}
	public void setStacom(int stacom) {
		this.stacom = stacom;
	}
	public int getBc() {
		return bc;
	}
	public void setBc(int bc) {
		this.bc = bc;
	}
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp.trim();
	}
	public int getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(int checkTime) {
		this.checkTime = checkTime;
	}
	public String getTimeType() {
		return timeType;
	}
	public void setTimeType(String timeType) {
		this.timeType = timeType.trim();
	}
	public float getSubTime() {
		return subTime;
	}
	public void setSubTime(float subTime) {
		this.subTime = subTime;
	}
	public float getStalat() {
		return stalat;
	}
	public void setStalat(float stalat) {
		this.stalat = stalat;
	}
	public float getStalon() {
		return stalon;
	}
	public void setStalon(float stalon) {
		this.stalon = stalon;
	}
	public float getShei() {
		return shei;
	}
	public void setShei(float shei) {
		this.shei = shei;
	}
	public int getSwei() {
		return swei;
	}
	public void setSwei(int swei) {
		this.swei = swei;
	}
	public int getVmol() {
		return vmol;
	}
	public void setVmol(int vmol) {
		this.vmol = vmol;
	}
	public int getDmol() {
		return dmol;
	}
	public void setDmol(int dmol) {
		this.dmol = dmol;
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype.trim();
	}
	public float getEgfactor() {
		return egfactor;
	}
	public void setEgfactor(float egfactor) {
		this.egfactor = egfactor;
	}
	public float getNgfactor() {
		return ngfactor;
	}
	public void setNgfactor(float ngfactor) {
		this.ngfactor = ngfactor;
	}
	public float getUgfactor() {
		return ugfactor;
	}
	public void setUgfactor(float ugfactor) {
		this.ugfactor = ugfactor;
	}
	public int getEdgree() {
		return edgree;
	}
	public void setEdgree(int edgree) {
		this.edgree = edgree;
	}
	public int getNdgree() {
		return ndgree;
	}
	public void setNdgree(int ndgree) {
		this.ndgree = ndgree;
	}
	public int getUdgree() {
		return udgree;
	}
	public void setUdgree(int udgree) {
		this.udgree = udgree;
	}
	public String getNcname() {
		return ncname;
	}
	public void setNcname(String ncname) {
		this.ncname = ncname.trim();
	}
	public String getEcname() {
		return ecname;
	}
	public void setEcname(String ecname) {
		this.ecname = ecname.trim();
	}
	public String getUcname() {
		return ucname;
	}
	public void setUcname(String ucname) {
		this.ucname = ucname.trim();
	}
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
	@Override
	public String toString() {
		return "TZMetaInfo [staid=" + staid + ", staName=" + staName + ", DAtype=" + DAtype + ", DAlen=" + DAlen
				+ ", v=" + v + ", samp=" + samp + ", stacom=" + stacom + ", bc=" + bc + ", tp=" + tp + ", checkTime="
				+ checkTime + ", timeType=" + timeType + ", subTime=" + subTime + ", stalat=" + stalat + ", stalon="
				+ stalon + ", shei=" + shei + ", swei=" + swei + ", vmol=" + vmol + ", dmol=" + dmol + ", stype="
				+ stype + ", egfactor=" + egfactor + ", ngfactor=" + ngfactor + ", ugfactor=" + ugfactor + ", edgree="
				+ edgree + ", ndgree=" + ndgree + ", udgree=" + udgree + ", ncname=" + ncname + ", ecname=" + ecname
				+ ", ucname=" + ucname + ", ncid=" + ncid + ", ecid=" + ecid + ", ucid=" + ucid + "]";
	}
	
	
	
}
