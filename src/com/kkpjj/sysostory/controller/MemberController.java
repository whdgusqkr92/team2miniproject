package com.kkpjj.sysostory.controller;

import java.util.Map;

import com.kkpjj.sysostory.model.dto.MemberDTO;
import com.kkpjj.sysostory.model.service.MemberService;
import com.kkpjj.sysostory.view.JoinPage;
import com.kkpjj.sysostory.view.MemberResultView;

public class MemberController {
	
	private MemberResultView memberResultView;
	private MemberService memberService;
	MemberDTO memberDTO = null;
	
	public MemberController() {
		this.memberResultView = new MemberResultView();
		this.memberService = new MemberService();
		this.memberDTO = new MemberDTO();
	}
	/* 회원가입 메소드 */
	public void InputMember(Map<String, String> requestMap) {
		
		memberDTO.setUserId(requestMap.get("id"));
		memberDTO.setUserPwd(requestMap.get("pwd"));
		memberDTO.setUserName(requestMap.get("name"));
		memberDTO.setEmail(requestMap.get("email"));
		
		int result = memberService.inputMember(memberDTO);
		
		if(result > 0) {
			memberResultView.success();
		} else {
			memberResultView.fail();
		}
	}
	
	
}
