package com.jhta.projectdb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.AllByMReviewVo;
import com.jhta.projectdb.vo.AllMoviesVo;
import com.jhta.projectdb.vo.MovieDetailVo;


@Repository
public class MovieListDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.film";
	//예매율순으로 상영 영화 불러오기
	public List<AllMoviesVo> showAllMovies(){
		System.out.println("DAO진입");
		return sqlSession.selectList(NAMESPACE+".movieListRrate");
	}

	//평점순으로 상영 영화 불러오기
	public List<AllMoviesVo> moviesByMRate(){
		System.out.println("평점순 상영 dao");
		return sqlSession.selectList(NAMESPACE+".movieListMRate");
	}
	
	//관람평순으로 상영 영화 불러오기
	public List<AllByMReviewVo> moviesByMReview() {
		return sqlSession.selectList(NAMESPACE+".showMoviesByReview");
	}
	
	//영화 상세정보 클릭 시 장르,감독,개봉일,출연진,줄거리 가져오기
	public MovieDetailVo showMovieDetailInfo(int filmNum){
		return sqlSession.selectOne(NAMESPACE+".showMovieDetailInfo",filmNum);
	}
	
	//영화 상세정보 클릭 시 영화포스터, 제목, 예매율, 누적관객수 가져오기
	public  AllMoviesVo showMovieDetailRate(int filmNum){
		return sqlSession.selectOne(NAMESPACE+".showMovieDetailRate",filmNum);
	}
}
