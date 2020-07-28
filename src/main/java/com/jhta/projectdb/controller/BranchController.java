package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.BranchService;

@RestController
public class BranchController {
	@Autowired
	private BranchService service;
	
	@RequestMapping("/service/region.do")
	public List<String> getBranchRegion(){
		return service.getBranchRegion();
	}
	
	@RequestMapping("/service/branch.do")
	public List<String> getBranch(@RequestParam String cityAddr){
		return service.getBranch(cityAddr);
	}
	
	@RequestMapping("/getNewBranch.do")
	public List<HashMap<String,Object>> getNewBranch(){
		return service.getNewBranch();
	}
	
}
