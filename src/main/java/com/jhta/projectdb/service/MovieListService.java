package com.jhta.projectdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.MovieListDao;
import com.jhta.projectdb.vo.AllByMReviewVo;
import com.jhta.projectdb.vo.AllMoviesVo;
import com.jhta.projectdb.vo.MovieDetailVo;

@Service
public class MovieListService {
	@Autowired
	MovieListDao mListDao;
	//예매율순으로 상영 영화 불러오기
	public List<AllMoviesVo> showAllMovies(){
		System.out.println("SERVICE진입");
		return mListDao.showAllMovies();
	}
	
	//평점순으로 상영 영화 불러오기
	public List<AllMoviesVo> moviesByMRate(){
		System.out.println("평점순 상영영화 service");
		return mListDao.moviesByMRate();
	}
	
	//관람평순으로 상영 영화 불러오기
	public List<AllByMReviewVo> moviesByMReview() {
		return mListDao.moviesByMReview();
	}
	
	//영화 상세정보 클릭 시 장르,감독,개봉일,출연진,줄거리 가져오기
	public MovieDetailVo showMovieDetailInfo(int filmNum) {
		return mListDao.showMovieDetailInfo(filmNum);
	}
	
	//영화 상세정보 클릭 시 영화포스터, 제목, 예매율, 누적관객수 가져오기
	public AllMoviesVo showMovieDetailRate(int filmNum){
		return mListDao.showMovieDetailRate(filmNum);
	}
}
