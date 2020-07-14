package com.jhta.projectdb.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MembershipDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPACE="com.jhta.mybatis.mapper.membership";
	
	public String getEmail(String memId) {
		System.out.println("####memberDaoŸ��######");
		return session.selectOne(NAMESPACE+".getEmail", memId);
	}
}
