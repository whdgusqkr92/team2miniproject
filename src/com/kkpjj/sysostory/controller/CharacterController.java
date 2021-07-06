package com.kkpjj.sysostory.controller;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.service.CharacterService;
import com.kkpjj.sysostory.model.service.StoryService;

public class CharacterController {
	
	private CharacterService CharacterService;
	private CharacterDTO characterDTO;

	public CharacterController() {
		this.CharacterService = new CharacterService();
		this.characterDTO = new CharacterDTO();
	}

	// 유저 코드, 캐릭터 코드에 대한 캐릭터 정보 조회용 메소드
	public CharacterDTO selectCharacterInfo(int userNo, int chrCode) {
		
		// CharacterView.java 뷰 페이지로 전달해야 됨
		CharacterDTO chrInfo = CharacterService.selectCharacterInfo(userNo, chrCode);

		return chrInfo;
	}

}
