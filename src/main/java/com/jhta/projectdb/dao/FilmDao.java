package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public class FilmDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private final String NAMESPACE = "com.jhta.mybatis.mapper.film";

	public List<String> getName(){
		return sqlSession.selectList(NAMESPACE+".getName");
	}
	public List<HashMap<String, Object>> getChat(String filmName){
		return sqlSession.selectList(NAMESPACE+".getChat",filmName);
	}
}
