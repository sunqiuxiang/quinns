package org.model;
public class Net {
	String flag;
	String type;
	int doctype;
	int unkown1;
	String twname;
	float lat;
	float lon;
	float hei;
	String unkown2;

	public String getFlag() {
		if ("".equals(flag)) {
			flag = "digital event";
		}
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getType() {
		if ("".equals(type)) {
			type = "PC";
		}
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDoctype() {
		if ("".equals("" + doctype) || doctype > 3 || doctype < 0) {
			doctype = 0;
		}
		return doctype;
	}

	public void setDoctype(int doctype) {
		this.doctype = doctype;
	}

	public int getUnkown1() {
		if ("".equals("" + unkown1)) {
			unkown1 = 0;
		}
		return unkown1;
	}

	public void setUnkown1(int unkown1) {
		this.unkown1 = unkown1;
	}

	public String getTwname() {
		return twname;
	}

	public void setTwname(String twname) {
		this.twname = twname;
	}

	
	public float getLat() {
		if ("".equals("" + lat)) {
			lat = 0.0f;
		}
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLon() {
		if ("".equals("" + lon)) {
			lon = 0.0f;
		}
		return lon;
	}

	public void setLon(float lon) {
		this.lon = lon;
	}

	public float getHei() {
		if ("".equals("" + hei)) {
			hei = 0.0f;
		}
		return hei;
	}

	public void setHei(float hei) {
		this.hei = hei;
	}

	public String getUnkown2() {
		return unkown2;
	}

	public void setUnkown2(String unkown2) {
		this.unkown2 = unkown2;
	}
}
