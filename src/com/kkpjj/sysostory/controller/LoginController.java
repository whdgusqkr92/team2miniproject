package com.kkpjj.sysostory.controller;

import javax.swing.JTextField;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.service.LoginService;
import com.kkpjj.sysostory.view.user.LoginResultView;

public class LoginController {
	
	private LoginResultView logingResultView;
	private LoginService loginService;
	CharacterDTO charaDTO = null;
	
	public LoginController() {
		this.logingResultView = new LoginResultView();
		this.loginService = new LoginService();
		this.charaDTO = new CharacterDTO();
	}
	
	public int createNickname(JTextField nicknameText) {
		
		charaDTO.setChrName(nicknameText.getText());
		
		int result = loginService.checkNickname(charaDTO);
		
		return result;
	}


}















