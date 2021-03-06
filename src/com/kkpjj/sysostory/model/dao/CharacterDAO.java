package com.kkpjj.sysostory.model.dao;

import static com.kkpjj.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.kkpjj.sysostory.model.dto.CharacterDTO;

public class CharacterDAO {

	private Properties prop;

	public CharacterDAO() {
		this.prop = new Properties();

		try {
			prop.loadFromXML(new FileInputStream("mapper/character-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public CharacterDTO selectCharacterInfo(Connection con, int userNo, int chrCode) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		CharacterDTO chrInfo= null;

		String query = prop.getProperty("selectCharacterInfo");

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, userNo);
			pstmt.setInt(2, chrCode);

			rset = pstmt.executeQuery();

			if(rset.next()) {
				chrInfo = new CharacterDTO();

				chrInfo.setChrCode(rset.getInt("CHR_CODE"));
				chrInfo.setUserNo(rset.getInt("USER_NO"));
				chrInfo.setChrName(rset.getString("CHR_NAME"));
				chrInfo.setChrHp(rset.getInt("CHR_HP"));
				chrInfo.setChrMp(rset.getInt("CHR_MP"));
				chrInfo.setChrExp(rset.getInt("CHR_EXP"));
				chrInfo.setChrLevel(rset.getInt("CHR_LEVEL"));
				chrInfo.setChrGold(rset.getInt("CHR_GOLD"));
				chrInfo.setChrMaxHp(rset.getInt("MAX_HP"));
				chrInfo.setChrMaxMp(rset.getInt("MAX_MP"));
				chrInfo.setChrMaxExp(rset.getInt("MAX_EXP"));
				chrInfo.setChrAtt(rset.getInt("CHR_ATT"));
				chrInfo.setChrDef(rset.getInt("CHR_DEF"));
				chrInfo.setChrSfx(rset.getString("SFX"));
				chrInfo.setChrBgm(rset.getString("BGM"));
				chrInfo.setChrEquipTitle(rset.getString("EQUIP_TITLE"));
				chrInfo.setChrEquipWeapon(rset.getString("EQUIP_WEAPON"));
				chrInfo.setChrEquipArmor(rset.getString("EQUIP_ARMOR"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return chrInfo;
	}

	public int updateChrInfo(Connection con, CharacterDTO chrDTO) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("updateCharacterInfo");
		
		try {
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, chrDTO.getChrHp());
			pstmt.setInt(2, chrDTO.getChrMp());
			pstmt.setInt(3, chrDTO.getChrExp());
			pstmt.setInt(4, chrDTO.getChrLevel());
			pstmt.setInt(5, chrDTO.getChrGold());
			pstmt.setInt(6, chrDTO.getChrMaxHp());
			pstmt.setInt(7, chrDTO.getChrMaxMp());
			pstmt.setInt(8, chrDTO.getChrMaxExp());
			pstmt.setInt(9, chrDTO.getChrAtt());
			pstmt.setInt(10, chrDTO.getChrDef());
			pstmt.setString(11, chrDTO.getChrSfx());
			pstmt.setString(12, chrDTO.getChrBgm());
			pstmt.setString(13, chrDTO.getChrEquipTitle());
			pstmt.setString(14, chrDTO.getChrEquipWeapon());
			pstmt.setString(15, chrDTO.getChrEquipArmor());
			pstmt.setInt(16, chrDTO.getUserNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
}
