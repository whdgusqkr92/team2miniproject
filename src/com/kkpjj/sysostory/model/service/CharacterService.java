package com.kkpjj.sysostory.model.service;

import java.sql.Connection;

import com.kkpjj.sysostory.model.dao.CharacterDAO;
import com.kkpjj.sysostory.model.dto.*;

import static com.kkpjj.common.JDBCTemplate.getConnection;
import static com.kkpjj.common.JDBCTemplate.close;

public class CharacterService {

	private CharacterDAO characterDAO;

	public CharacterService() {
		this.characterDAO = new CharacterDAO();
	}

	public CharacterDTO selectCharacterInfo(int userNo, int chrCode) {
		Connection con = getConnection();

		CharacterDTO chrInfo = characterDAO.selectCharacterInfo(con, userNo, chrCode);

		close(con);

		return chrInfo;
	}

}

