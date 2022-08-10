package com.jachs.jdk.jol;

/***
 * 
 * @author zhanchaohan
 *
 */
public class People {
	//8大基本类型大小
	private boolean bo;//1 byte
	private byte bt;//1 byte
	private short st;//2 byte
	private char ca;//2 byte
	private int it;//4 byte
	private long lg;//8 byte
	private float ft;//4 byte
	private double de;//8 byte
	
	private String sg;
	
	
	
	public People() {
		super();
	}



	public People(boolean bo, byte bt, short st, char ca, int it, long lg, float ft, double de, String sg) {
		super();
		this.bo = bo;
		this.bt = bt;
		this.st = st;
		this.ca = ca;
		this.it = it;
		this.lg = lg;
		this.ft = ft;
		this.de = de;
		this.sg = sg;
	}



	public boolean isBo() {
		return bo;
	}



	public void setBo(boolean bo) {
		this.bo = bo;
	}



	public byte getBt() {
		return bt;
	}



	public void setBt(byte bt) {
		this.bt = bt;
	}



	public short getSt() {
		return st;
	}



	public void setSt(short st) {
		this.st = st;
	}



	public char getCa() {
		return ca;
	}



	public void setCa(char ca) {
		this.ca = ca;
	}



	public int getIt() {
		return it;
	}



	public void setIt(int it) {
		this.it = it;
	}



	public long getLg() {
		return lg;
	}



	public void setLg(long lg) {
		this.lg = lg;
	}



	public float getFt() {
		return ft;
	}



	public void setFt(float ft) {
		this.ft = ft;
	}



	public double getDe() {
		return de;
	}



	public void setDe(double de) {
		this.de = de;
	}



	public String getSg() {
		return sg;
	}



	public void setSg(String sg) {
		this.sg = sg;
	}
	
}
