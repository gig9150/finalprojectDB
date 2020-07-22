package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.FilmService;

@RestController
public class FilmController {
	@Autowired
	private FilmService service;
	
	@RequestMapping("/getThumbnailMovie.do")
	public List<HashMap<String,Object>> getThumbnailMovie(){
		return service.getThumbnailMovie();
	}
}
