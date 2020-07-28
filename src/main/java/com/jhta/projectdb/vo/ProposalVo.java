package com.jhta.projectdb.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProposalVo {
	private int proNum;
	private String memberId;
	private String proAddr;
	private String proGoal;
	private String proScale;
	private String proStatus;
	private String proRegdate;
	public ProposalVo(int proNum, String memberId, String proAddr, String proGoal, String proScale, String proStatus,
			String proRegdate) {
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date proRegdate;
	private String cityAddr;
	
	public ProposalVo() {}

	public ProposalVo(int proNum, String memberId, String proAddr, String proGoal, String proScale, String proStatus,
			Date proRegdate, String cityAddr) {
		super();
		this.proNum = proNum;
		this.memberId = memberId;
		this.proAddr = proAddr;
		this.proGoal = proGoal;
		this.proScale = proScale;
		this.proStatus = proStatus;
		this.proRegdate = proRegdate;
		this.cityAddr = cityAddr;
	}

	public int getProNum() {
		return proNum;
	}

	public void setProNum(int proNum) {
		this.proNum = proNum;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getProAddr() {
		return proAddr;
	}

	public void setProAddr(String proAddr) {
		this.proAddr = proAddr;
	}

	public String getProGoal() {
		return proGoal;
	}

	public void setProGoal(String proGoal) {
		this.proGoal = proGoal;
	}

	public String getProScale() {
		return proScale;
	}

	public void setProScale(String proScale) {
		this.proScale = proScale;
	}

	public String getProStatus() {
		return proStatus;
	}

	public void setProStatus(String proStatus) {
		this.proStatus = proStatus;
	}
	public String getProRegdate() {
		return proRegdate;
	}
	public void setProRegdate(String proRegdate) {

	public Date getProRegdate() {
		return proRegdate;
	}

	public void setProRegdate(Date proRegdate) {
		this.proRegdate = proRegdate;
	}

	public String getCityAddr() {
		return cityAddr;
	}

	public void setCityAddr(String cityAddr) {
		this.cityAddr = cityAddr;
	}
	
	
}
