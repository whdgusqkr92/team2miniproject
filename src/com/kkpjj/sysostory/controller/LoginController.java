package com.kkpjj.sysostory.controller;

import javax.swing.JTextField;

import com.kkpjj.sysostory.model.dto.CharacterDTO;

import com.kkpjj.sysostory.model.service.LoginService;
import com.kkpjj.sysostory.view.user.LoginResultView;

public class LoginController {
	
	private LoginResultView logingResultView;
	private LoginService loginService;

	CharacterDTO characterDTO = null;
	MemberDTO memberDTO = null;

	
	public LoginController() {
		this.logingResultView = new LoginResultView();
		this.loginService = new LoginService();

		this.characterDTO = new CharacterDTO();
		this.memberDTO = new MemberDTO();

	}
	
	public int createNickname(String nicknameText, String idText) {
		characterDTO.setChrName(nicknameText);

		int numberResult = loginService.checkMemberNumber(idText);
		memberDTO.setUserNo(numberResult);
		
//		int characterNumberResult = loginService.checkCharacterNumber(idText);
		
		int result = loginService.checkNickname(characterDTO, memberDTO);
		
		return result;
	}
}















