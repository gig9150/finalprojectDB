package com.jhta.projectdb.controller;

import java.util.HashMap;
import java.util.List;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.MembershipServcie;
import com.jhta.projectdb.service.ProposalService;
import com.jhta.projectdb.vo.ApproveProposalVo;
import com.jhta.projectdb.vo.BranchVo;
import com.jhta.projectdb.vo.ProposalVo;

@RestController
public class ProposalController {
	@Autowired
	private ProposalService proService;
	
	@Autowired
	private MembershipServcie memberService;
	
	@RequestMapping("/proposal/brManagement/totalRowNum")
	public String totalRowNum() {
		return proService.totalRowNum()+"";
	}
	
	@RequestMapping("/proposal/brManagement")
	public List<ProposalVo> proposalBoard(@RequestBody HashMap<String, Object> map) {
		List<ProposalVo> list = proService.getRowNums(map);
		return list;
	}
	
	@RequestMapping("/proposal/proBoardDetail/proGetinfo")
	public ProposalVo proGetinfo(@RequestParam int proNum) {
		ProposalVo proVo = proService.getinfo(proNum);
		return proVo;
	}
	@RequestMapping("/proposal/proBoardDetail/nextPro")
	public ProposalVo proNext(@RequestParam int proNum) {
		ProposalVo nextVo = proService.getNextTitle(proNum);
		return nextVo;
	}
	@RequestMapping("/proposal/proBoardDetail/prePro")
	public ProposalVo prePro(@RequestParam int proNum) {
		ProposalVo preVo = proService.getPreTitle(proNum);
		return preVo;
	}
	@RequestMapping("/proposal/rejectProposal")
	public String rejectProposal(@RequestParam int proNum) {
		return proService.rejectProposal(proNum)+"";
	}
	@RequestMapping("/proposal/approved/email")
	public String email(@RequestParam String memId) {
		return memberService.getEmail(memId);
	}
	
	@RequestMapping("/proposal/approved")
	public String approveProposal(@RequestBody ApproveProposalVo appVo) {
		int updateNum=proService.approveProposal(appVo.getProVo(),appVo.getBrVo());
		return updateNum+"";
	}
}