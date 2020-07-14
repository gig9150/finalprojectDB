package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.BranchVo;

@Repository
public class BranchDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.branch";
	public List<BranchVo> list(HashMap<String,Object> map){
		return sqlSession.selectList(NAMESPACE+".list", map);
	}
	public int count(HashMap<String,Object> map) {
		return sqlSession.selectOne(NAMESPACE+".count", map);
	}
	
	//���ι�ư ������ Ʈ����� ����Ǵ� �Լ� (proposal�� update/ branch�� insertó����)
	public int appProposalNBranch(BranchVo brVo) {
		System.out.println("braDao"+brVo);
		return sqlSession.insert(NAMESPACE+".insert",brVo);
	}

}
