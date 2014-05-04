package com.cgs.kerberos.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * 回应客户端密码加密部分
 * 
 * @author xumh
 *
 */
public class TgtResponse implements Serializable{

	private static final long serialVersionUID = 108651713906189188L;
	
	private String TgsName;
	private Date timeStamp;
	private long lifeTime;
	private byte[] tgtSessionKey;
	
	public String getTgsName() {
		return TgsName;
	}
	public void setTgsName(String tgsName) {
		TgsName = tgsName;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public long getLifeTime() {
		return lifeTime;
	}
	public void setLifeTime(long lifeTime) {
		this.lifeTime = lifeTime;
	}
	public byte[] getTgtSessionKey() {
		return tgtSessionKey;
	}
	public void setTgtSessionKey(byte[] tgtSessionKey) {
		this.tgtSessionKey = tgtSessionKey;
	}
	
	public String toString() {
		return "TgtResponse [TgsName=" + TgsName + ", timeStamp=" + timeStamp + ", lifeTime=" + lifeTime + ", tgtSessionKey=" + Arrays.toString(tgtSessionKey)
				+ "]";
	}
}
