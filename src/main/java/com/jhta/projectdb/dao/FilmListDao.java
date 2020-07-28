package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.CastVo;
import com.jhta.projectdb.vo.FilmVo;
import com.jhta.projectdb.vo.GenreVo;
import com.jhta.projectdb.vo.MovieImgVo;
import com.jhta.projectdb.vo.PurchaseFilmVo;

@Repository
public class FilmListDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.film";
	private final String NAMESPACE1="com.jhta.mybatis.mapper.cast";
	private final String NAMESPACE2="com.jhta.mybatis.mapper.genre";
	private final String NAMESPACE3="com.jhta.mybatis.mapper.movieImg";
	private final String NAMESPACE4="com.jhta.mybatis.mapper.purchasefilm";
	
	public List<HashMap<String,Object>> list(HashMap<String,Object> map){
		return sqlSession.selectList(NAMESPACE+".list",map);
	}
	
	public int count() {
		return sqlSession.selectOne(NAMESPACE+".count");
	}
	
	public List<MovieImgVo> list3(HashMap<String,Object> map){
		return sqlSession.selectList(NAMESPACE3+".list", map);
	}
	
	public FilmVo getinfo(int filmNum) {
		return sqlSession.selectOne(NAMESPACE+".getinfo", filmNum);
	}

	public CastVo getinfo1(int filmNum) {
		return sqlSession.selectOne(NAMESPACE1+".getinfo",filmNum);
	}
	
	public GenreVo getinfo2(int genreNum) {
		return sqlSession.selectOne(NAMESPACE2+".getinfo", genreNum);
	}
	
	public MovieImgVo getinfo3(int filmNum) {
		return sqlSession.selectOne(NAMESPACE3+".getinfo", filmNum);
	}
	
	public int insert(PurchaseFilmVo vo) {
		return sqlSession.insert(NAMESPACE4+".insert",vo);
	}
	
	public List<HashMap<String, Object>> branchList(int branchNum){
		return sqlSession.selectList(NAMESPACE4+".branchList", branchNum);
	}
	
	public HashMap<String,Object> getTodayMoive(){
		return sqlSession.selectOne(NAMESPACE+".getTodayMoive");
	}
}
