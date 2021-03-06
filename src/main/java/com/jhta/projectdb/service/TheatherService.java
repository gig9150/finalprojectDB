package com.jhta.projectdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.TheatherDao;
import com.jhta.projectdb.vo.TheatherVo;

@Service
public class TheatherService {
	@Autowired
	private TheatherDao dao;
	
	public List<TheatherVo> list(int branchNum){
		return dao.list(branchNum);
	}
	
	public int delete(int theatherNum) {
		return dao.delete(theatherNum);
	}
	public int update(TheatherVo vo) {
		return dao.update(vo);
	}
	public int insert(TheatherVo vo) {
		return dao.insert(vo);
	}
	public TheatherVo getinfo(int theatherNum) {
		return dao.getinfo(theatherNum);
	}
	
	public List<TheatherVo> listCount(int branchNum){
		return dao.listCount(branchNum);
	}

}
