package com.jhta.projectdb.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MScheduleListVo {
	private int purchasefilmNum; //��ȭ�󿵱Ǳ��� ������
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date purchaseDate; //�������󿵽�����
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date filmDeadline; //��������������
	private int filmNum; //��ȭ��ȣ ������
	private int branchNum; //������ȣ������
	private String filmName; //��ȭ�̸�
	private String filmStory; //��ȭ�ٰŸ�
	private String genreName; //�帣����
	private String movieimgUrl; //�̹������
	
	public MScheduleListVo() {}

	public MScheduleListVo(int purchasefilmNum, Date purchaseDate, Date filmDeadline, int filmNum, int branchNum,
			String filmName, String filmStory, String genreName, String movieimgUrl) {
		super();
		this.purchasefilmNum = purchasefilmNum;
		this.purchaseDate = purchaseDate;
		this.filmDeadline = filmDeadline;
		this.filmNum = filmNum;
		this.branchNum = branchNum;
		this.filmName = filmName;
		this.filmStory = filmStory;
		this.genreName = genreName;
		this.movieimgUrl = movieimgUrl;
	}

	public int getPurchasefilmNum() {
		return purchasefilmNum;
	}

	public void setPurchasefilmNum(int purchasefilmNum) {
		this.purchasefilmNum = purchasefilmNum;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Date getFilmDeadline() {
		return filmDeadline;
	}

	public void setFilmDeadline(Date filmDeadline) {
		this.filmDeadline = filmDeadline;
	}

	public int getFilmNum() {
		return filmNum;
	}

	public void setFilmNum(int filmNum) {
		this.filmNum = filmNum;
	}

	public int getBranchNum() {
		return branchNum;
	}

	public void setBranchNum(int branchNum) {
		this.branchNum = branchNum;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getFilmStory() {
		return filmStory;
	}

	public void setFilmStory(String filmStory) {
		this.filmStory = filmStory;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	public String getMovieimgUrl() {
		return movieimgUrl;
	}

	public void setMovieimgUrl(String movieimgUrl) {
		this.movieimgUrl = movieimgUrl;
	}
	

}
