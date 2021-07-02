package com.kkpjj.sysostory.controller;

import javax.swing.JTextField;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.service.LoginService;
import com.kkpjj.sysostory.view.LoginResultView;

public class LoginController {
	
	private LoginResultView logingResultView;
	private LoginService loginService;
	CharacterDTO characterDTO = null;
	
	public LoginController() {
		this.logingResultView = new LoginResultView();
		this.loginService = new LoginService();
		this.characterDTO = new CharacterDTO();
	}
	
	public int createNickname(JTextField nicknameText) {
		
		characterDTO.setChrName(nicknameText.getText());
		
		int result = loginService.checkNickname(characterDTO);
		
		return result;
	}


}















