package com.jhta.projectdb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.MovieSawVo;

@Repository
public class MovieSawDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPASE = "com.jhta.mybatis.mapper.moviesaw";
	
	public List<MovieSawVo> moviesawList(int memNum){
		return session.selectList(NAMESPASE+".moviesawList",memNum);
	}
	public int movieCount(int memNum){
		return session.selectOne(NAMESPASE+".movieCount",memNum);
	}
}
