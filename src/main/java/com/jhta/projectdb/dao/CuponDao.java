package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.CuponVo;

@Repository
public class CuponDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPASE = "com.jhta.mybatis.mapper.cupon";
	
	public List<CuponVo> cuponList(HashMap<String, Object> map){
		return session.selectList(NAMESPASE+".list",map);
	}
	public int cuponCount(int memNum) {
		return session.selectOne(NAMESPASE+".cuponCount",memNum);
	}
	
}