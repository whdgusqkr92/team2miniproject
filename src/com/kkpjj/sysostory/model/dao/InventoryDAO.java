package com.kkpjj.sysostory.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import com.kkpjj.sysostory.model.dto.ArmorDTO;
import com.kkpjj.sysostory.model.dto.PotionDTO;
import com.kkpjj.sysostory.model.dto.WeaponDTO;

public class InventoryDAO {
	
	private Properties prop;
	
	public InventoryDAO() {
		this.prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/inventory-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public List<WeaponDTO> getWeaponInfo(Connection con) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		List<WeaponDTO> weaponList = null;
		
		String query = prop.getProperty("weaponInventory");
		
		try {
			pstmt = con.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		pstmt.setInt(1, );
		
		return null;
	}

	public List<ArmorDTO> getArmorInfo(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<PotionDTO> getPotionInfo(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

}
