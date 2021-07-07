package com.kkpjj.sysostory.model.dao;

import static com.kkpjj.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MemberDTO;

public class LoginDAO {
	
	private Properties prop;
	CharacterDTO characterDTO;
	MemberDTO memberDTO;
	
	public LoginDAO() {
		this.prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/login-query.xml"));
			
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int insertNickname(Connection con, CharacterDTO characterDTO, MemberDTO memberDTO) {

		PreparedStatement pstmt = null;
		
		int result = 0;
		
		ResultSet checkNewUesrResultSet = null;
		int checkChrNumber = 0;
		
		String query1 = prop.getProperty("insertNickname");
		String query2 = prop.getProperty("updateNickname");
		String query3 = prop.getProperty("checkNewUser"); 
		
		try {
			pstmt = con.prepareStatement(query3);
			pstmt.setInt(1, memberDTO.getUserNo());
			checkNewUesrResultSet = pstmt.executeQuery();
			
			while (checkNewUesrResultSet.next()) {
				checkChrNumber =  checkNewUesrResultSet.getInt("CHR_CODE");
			}
			
			if (checkChrNumber > 0 ) { // 닉네임 설정을 최초 한번 이상 한 유저 (기존 유저)
				pstmt = con.prepareStatement(query2);
	            pstmt.setString(1, characterDTO.getChrName());
	            pstmt.setInt(2, memberDTO.getUserNo());
	            
	            result = pstmt.executeUpdate();
			}else { // 닉네임 설정을 최초 한번 이상 안한 유저 (신규유저)
				pstmt = con.prepareStatement(query1);
	            pstmt.setInt(1, memberDTO.getUserNo());
	            pstmt.setString(2, characterDTO.getChrName());
	            
	            result = pstmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
//			close(con);
		}
		
		return result;
	}

	
	public int searchMemberNumber(Connection con, String idText) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		System.out.println("아이디텍스트" + idText);
		String query = prop.getProperty("searchMemberNumber");
		int resultIdNumber = 0;
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, idText);

			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				resultIdNumber = rset.getInt("USER_NO");
				System.out.println("유저넘버" + rset.getInt("USER_NO"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return resultIdNumber;
	}

	public List<MemberDTO> selectAllMember(Connection con) {
		
		PreparedStatement pstmt = null;
		
		ResultSet rset = null;
		
		List<MemberDTO> memberList = null;
		
		String query =prop.getProperty("selectAllMember");
		
		try {
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			memberList = new ArrayList<>();
			
			while(rset.next()) {
				MemberDTO memberDTO = new MemberDTO();
				memberDTO.setUserNo(rset.getInt("USER_NO"));
				memberDTO.setUserGrade(rset.getString("USER_GRADE"));
				memberDTO.setUserId(rset.getString("USER_ID"));
				memberDTO.setUserPwd(rset.getString("USER_PWD"));
				memberDTO.setUserName(rset.getString("USER_NAME"));
				memberDTO.setEmail(rset.getString("EMAIL"));
				memberDTO.setUserStatus(rset.getString("USER_STATUS"));
				
				memberList.add(memberDTO);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		
		return memberList;
	}
	
	
	public CharacterDTO searchCharacterInfo(Connection con, MemberDTO memberDTO) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("selectAllChrInfo");
		CharacterDTO charDTO = new CharacterDTO();
		
		try {
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				charDTO.setChrCode(rset.getInt("CHR_CODE"));
				charDTO.setUserNo(rset.getInt("USER_NO"));
				charDTO.setChrName(rset.getString("CHR_NAME"));
				charDTO.setChrHp(rset.getInt("CHR_HP"));
				charDTO.setChrMp(rset.getInt("CHR_MP"));
				charDTO.setChrExp(rset.getInt("CHR_EXP"));
				charDTO.setChrLevel(rset.getInt("CHR_LEVEL"));
				charDTO.setChrGold(rset.getInt("CHR_GOLD"));
				charDTO.setChrMaxHp(rset.getInt("MAX_HP"));
				charDTO.setChrMaxMp(rset.getInt("MAX_MP"));
				charDTO.setChrMaxExp(rset.getInt("MAX_EXP"));
				charDTO.setChrAtt(rset.getInt("CHR_ATT"));
				charDTO.setChrDef(rset.getInt("CHR_DEF"));
				charDTO.setChrSfx(rset.getString("SFX"));
				charDTO.setChrBmg(rset.getString("BGM"));
				charDTO.setChrEquipTitle(rset.getString("EQUIP_TITLE"));
				charDTO.setChrEquipWeapon(rset.getString("EQUIP_WEAPON"));
				charDTO.setChrEquipArmor(rset.getString("EQUIP_ARMOR"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return charDTO;
	}
	
}
