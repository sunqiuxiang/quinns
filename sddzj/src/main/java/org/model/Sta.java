package org.model;
import java.util.ArrayList;

public class Sta {
	int StaId;
	String staName;
	String DAtype;
	short DAlen;
	float v;
	int samp;
	int stacom;
	short bc;
	String tp;
	short checktime;
	String timetype;
	float subtime;
	float stalat;
	float stalon;
	float shei;
	String unkown1;
	short swei;
	short vmol;
	int dmol;
	String stype;
	
	float gfactorN;
	int dgreeN;
	String unkownN;
	ArrayList<Double> dataN;
	String cnameN;
	
	float gfactorE;
	int dgreeE;
	String unkownE;
	ArrayList<Double> dataE;
	String cnameE;
	
	float gfactorU;
	String cnameU;
	int dgreeU;
	String unkownU;
	ArrayList<Double> dataU;

	
	public int getStaId() {
		return StaId;
	}

	public void setStaId(int staId) {
		StaId = staId;
	}

	public String getCnameN() {
		return cnameN;
	}

	public void setCnameN(String cnameN) {
		this.cnameN = cnameN;
	}

	public String getCnameE() {
		return cnameE;
	}

	public void setCnameE(String cnameE) {
		this.cnameE = cnameE;
	}

	public String getCnameU() {
		return cnameU;
	}

	public void setCnameU(String cnameU) {
		this.cnameU = cnameU;
	}

	public String getStaName() {
		return staName;
	}

	public void setStaName(String staName) {
		this.staName = staName;
	}

	public String getDAtype() {
		return DAtype;
	}

	public void setDAtype(String dAtype) {
		DAtype = dAtype;
	}

	public short getDAlen() {
		return DAlen;
	}

	public void setDAlen(short dAlen) {
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

	public short getBc() {
		return bc;
	}

	public void setBc(short bc) {
		this.bc = bc;
	}

	public String getTp() {
		return tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}

	public short getChecktime() {
		return checktime;
	}

	public void setChecktime(short checktime) {
		this.checktime = checktime;
	}

	public String getTimetype() {
		return timetype;
	}

	public void setTimetype(String timetype) {
		this.timetype = timetype;
	}

	public float getSubtime() {
		return subtime;
	}

	public void setSubtime(float subtime) {
		this.subtime = subtime;
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

	public String getUnkown1() {
		return unkown1;
	}

	public void setUnkown1(String unkown1) {
		this.unkown1 = unkown1;
	}

	public short getSwei() {
		return swei;
	}

	public void setSwei(short swei) {
		this.swei = swei;
	}

	public short getVmol() {
		return vmol;
	}

	public void setVmol(short vmol) {
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
		this.stype = stype;
	}

	public float getGfactorN() {
		return gfactorN;
	}

	public void setGfactorN(float gfactorN) {
		this.gfactorN = gfactorN;
	}

	public int getDgreeN() {
		return dgreeN;
	}

	public void setDgreeN(int dgreeN) {
		this.dgreeN = dgreeN;
	}

	public String getUnkownN() {
		return unkownN;
	}

	public void setUnkownN(String unkownN) {
		this.unkownN = unkownN;
	}

	public float getGfactorE() {
		return gfactorE;
	}

	public void setGfactorE(float gfactorE) {
		this.gfactorE = gfactorE;
	}

	public int getDgreeE() {
		return dgreeE;
	}

	public void setDgreeE(int dgreeE) {
		this.dgreeE = dgreeE;
	}

	public String getUnkownE() {
		return unkownE;
	}

	public void setUnkownE(String unkownE) {
		this.unkownE = unkownE;
	}

	public float getGfactorU() {
		return gfactorU;
	}

	public void setGfactorU(float gfactorU) {
		this.gfactorU = gfactorU;
	}

	public int getDgreeU() {
		return dgreeU;
	}

	public void setDgreeU(int dgreeU) {
		this.dgreeU = dgreeU;
	}

	public String getUnkownU() {
		return unkownU;
	}

	public void setUnkownU(String unkownU) {
		this.unkownU = unkownU;
	}

	public ArrayList<Double> getDataN() {
		return dataN;
	}

	public void setDataN(ArrayList<Double> dataN) {
		this.dataN = dataN;
	}

	public ArrayList<Double> getDataE() {
		return dataE;
	}

	public void setDataE(ArrayList<Double> dataE) {
		this.dataE = dataE;
	}

	public ArrayList<Double> getDataU() {
		return dataU;
	}

	public void setDataU(ArrayList<Double> dataU) {
		this.dataU = dataU;
	}
}
