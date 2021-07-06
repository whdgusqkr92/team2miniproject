package com.kkpjj.sysostory.view.character;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.CharacterController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;

public class CharacterInfo extends JPanel {
	
	private JFrame mf;
	private CharacterDTO chrDTO;
	private CharacterController cc;
	
	public CharacterInfo(JFrame mf, CharacterDTO chrDTO) {
		
		this.mf = mf;
		this.chrDTO = chrDTO;
		
		cc = new CharacterController();
		
		/* -------------- 캐릭터 정보 테스트 ----------------- */
		
		int userNo = 1;		// 사용자 번호
		int chrCode = 2;	// 캐릭터 코드
		
		chrDTO.setChrCode(chrCode);
		chrDTO.setUserNo(userNo);
		
		
	}

}
