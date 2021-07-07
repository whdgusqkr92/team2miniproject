package com.kkpjj.sysostory.controller;

import java.util.ArrayList;
import java.util.List;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MemberDTO;
import com.kkpjj.sysostory.model.service.LoginService;

public class LoginController {
	
	private LoginService loginService;

	CharacterDTO characterDTO = null;
	MemberDTO memberDTO = null;

	
	public LoginController() {
		this.loginService = new LoginService();
		this.characterDTO = new CharacterDTO();
		this.memberDTO = new MemberDTO();

	}
	
	public int createNickname(String nicknameText, String idText, MemberDTO memberDTO) {
		
		characterDTO.setChrName(nicknameText);
		int numberResult = loginService.checkMemberNumber(idText);
		memberDTO.setUserNo(numberResult);
		int result = loginService.checkNickname(characterDTO, memberDTO);
		
		return result;
	}

	public List<MemberDTO> searchAllMember() {
		List<MemberDTO> memberList = new ArrayList<>();
		memberList = loginService.searchAllMember();
		
		return memberList;
	}
	
	public CharacterDTO searchCharacterInfo(String idText) {
		
		memberDTO.setUserId(idText);
		CharacterDTO charDTO = loginService.searchCharacterInfo(memberDTO);
		System.out.println("loginController : " + charDTO.getUserNo());

		return charDTO;
	}
	
}















