package org.model;

public class TWMetaInfo {
	private String uuid;//uuid
	private String evtFlag;//标志
	private String type;//类型
	private int docType;//文档类型
	private int staNum;//台站总数
	private String twName;//台网名称
	private float lat;//台网中心维度
	private float lon;//台网中心经度
	private float hei;//台网中心高度
	private String startDate;//开始时间
	private int dataSec;//单位长度
	private String endDate;
	
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public TWMetaInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TWMetaInfo(String uuid, String evtFlag, String type, int docType, int staNum, String twName, float lat,
			float lon, float hei, String startDate, int dataSec) {
		super();
		this.uuid = uuid;
		this.evtFlag = evtFlag.trim();
		this.type = type.trim();
		this.docType = docType;
		this.staNum = staNum;
		this.twName = twName.trim();
		this.lat = lat;
		this.lon = lon;
		this.hei = hei;
		this.startDate = startDate;
		this.dataSec = dataSec;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getEvtFlag() {
		return evtFlag;
	}
	public void setEvtFlag(String evtFlag) {
		this.evtFlag = evtFlag.trim();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type.trim();
	}
	public int getDocType() {
		return docType;
	}
	public void setDocType(int docType) {
		this.docType = docType;
	}
	public int getStaNum() {
		return staNum;
	}
	public void setStaNum(int staNum) {
		this.staNum = staNum;
	}
	public String getTwName() {
		return twName;
	}
	public void setTwName(String twName) {
		this.twName = twName.trim();
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	public float getHei() {
		return hei;
	}
	public void setHei(float hei) {
		this.hei = hei;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public int getDataSec() {
		return dataSec;
	}
	public void setDataSec(int dataSec) {
		this.dataSec = dataSec;
	}
	@Override
	public String toString() {
		return "TWMetaInfo [uuid=" + uuid + ", evtFlag=" + evtFlag + ", type=" + type + ", docType=" + docType
				+ ", staNum=" + staNum + ", twName=" + twName + ", lat=" + lat + ", lon=" + lon + ", hei=" + hei
				+ ", startDate=" + startDate + ", dataSec=" + dataSec + "]";
	}
	
	
	
}
