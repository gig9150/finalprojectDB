package com.jhta.projectdb.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FilmVo {
	private int filmNum;
	private String filmName;
	private String filmStory;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date filmStart;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date filmEnd;
	private int filmPrice;
	private String filmHead;
	private String filmStatus;
	private int genreNum;
	public FilmVo(int filmNum, String filmName, String filmStory, Date filmStart, Date filmEnd, int filmPrice,
			String filmHead, String filmStatus, int genreNum) {
		super();
		this.filmNum = filmNum;
		this.filmName = filmName;
		this.filmStory = filmStory;
		this.filmStart = filmStart;
		this.filmEnd = filmEnd;
		this.filmPrice = filmPrice;
		this.filmHead = filmHead;
		this.filmStatus = filmStatus;
		this.genreNum = genreNum;
	}
	public FilmVo() {
		super();
	}
	public int getFilmNum() {
		return filmNum;
	}
	public void setFilmNum(int filmNum) {
		this.filmNum = filmNum;
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
	public Date getFilmStart() {
		return filmStart;
	}
	public void setFilmStart(Date filmStart) {
		this.filmStart = filmStart;
	}
	public Date getFilmEnd() {
		return filmEnd;
	}
	public void setFilmEnd(Date filmEnd) {
		this.filmEnd = filmEnd;
	}
	public int getFilmPrice() {
		return filmPrice;
	}
	public void setFilmPrice(int filmPrice) {
		this.filmPrice = filmPrice;
	}
	public String getFilmHead() {
		return filmHead;
	}
	public void setFilmHead(String filmHead) {
		this.filmHead = filmHead;
	}
	public String getFilmStatus() {
		return filmStatus;
	}
	public void setFilmStatus(String filmStatus) {
		this.filmStatus = filmStatus;
	}
	public int getGenreNum() {
		return genreNum;
	}
	public void setGenreNum(int genreNum) {
		this.genreNum = genreNum;
	}
	
}
