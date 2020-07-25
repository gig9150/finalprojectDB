package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.LogDao;
import com.jhta.projectdb.vo.MembershipVo;

@Service
public class LogService {
	@Autowired
	private LogDao dao;
	
	public int getinfo(String memId) {
		return dao.getinfo(memId);
	}
	
	public int signmake(MembershipVo vo) {
		System.out.println("db 서비스");
		return dao.signmake(vo);
	}
	public MembershipVo loging(String memId, String memPwd) {
		return dao.loging(memId,memPwd);
	}
	
	public int memuserok(MembershipVo vo) {
		System.out.println("db 서비스");
		return dao.memuserok(vo);
	}
}