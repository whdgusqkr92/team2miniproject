package com.kkpjj.sysostory.controller;

import javax.swing.JTextField;

import com.kkpjj.sysostory.model.dto.CharaDTO;
import com.kkpjj.sysostory.model.service.LoginService;
import com.kkpjj.sysostory.view.LoginResultView;

public class LoginController {
	
	private LoginResultView logingResultView;
	private LoginService loginService;
	CharaDTO charaDTO = null;
	
	public LoginController() {
		this.logingResultView = new LoginResultView();
		this.loginService = new LoginService();
		this.charaDTO = new CharaDTO();
	}
	
	public int createNickname(JTextField nicknameText) {
		
		charaDTO.setChrName(nicknameText.getText());
		
		int result = loginService.checkNickname(charaDTO);
		
		return result;
	}


}















