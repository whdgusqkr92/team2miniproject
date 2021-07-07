package com.kkpjj.sysostory.controller;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kkpjj.sysostory.model.dto.MemberDTO;
import com.kkpjj.sysostory.model.service.AdminService;
import com.kkpjj.sysostory.model.service.MemberService;

public class AdminController {
	
	private MemberDTO memberDTO;
	private AdminService adminSerivce;
	
	
	public AdminController() {
		this.memberDTO = new MemberDTO();
		this.adminSerivce = new AdminService();
	}
	public int adminLogin(JTextField idText, JPasswordField pwdText) {
		String pwdString = new String(pwdText.getPassword());
		
		memberDTO.setUserId(idText.getText());
		memberDTO.setUserPwd(pwdString);
		
		int result = adminSerivce.adminLoginManager(memberDTO);
		
		if(result > 0) {
			System.out.println("관리자 로그인에 성공했습니다.");
		
			return 1;
		} else {
			System.out.println("관리자 로그인에 실패했습니다.");
			
			return 0;
		}
		
	}

}
