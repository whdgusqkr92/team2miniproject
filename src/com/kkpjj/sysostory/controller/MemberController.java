package com.kkpjj.sysostory.controller;

import java.util.Map;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MemberDTO;
import com.kkpjj.sysostory.model.service.MemberService;
import com.kkpjj.sysostory.view.member.MemberResultView;

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
	
	public int Login(JTextField idText, JPasswordField pwdText) {
		String pwdString = new String(pwdText.getPassword());
		
		memberDTO.setUserId(idText.getText());
		memberDTO.setUserPwd(pwdString);
		
		int result = memberService.loginMember(memberDTO);
		
		if(result > 0) {
			memberResultView.loginSuccess();
//			new AfterLogin(idText.getText());
//			int userNo= memberDTO.getUserNo();
			
			return 1;
		} else {
			memberResultView.loginfail();
			
			return 0;
		}
	}

	public String findId(JTextField nameText, JTextField emailText) {
		
		memberDTO.setUserName(nameText.getText());
		memberDTO.setEmail(emailText.getText());
		
		String resultID = memberService.checkMemberId(memberDTO);
		
		return resultID;
		
	}

	public String FindPwd(JTextField idText, JTextField nameText, JTextField emailText) {
		
		memberDTO.setUserId(idText.getText());
		memberDTO.setUserName(nameText.getText());
		memberDTO.setEmail(emailText.getText());
		
		String resultPwd = memberService.checkMemberPwd(memberDTO);
		
		return resultPwd;
	}

}

