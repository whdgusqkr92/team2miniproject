package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.kkpjj.sysostory.model.dao.InventoryDAO;
import com.kkpjj.sysostory.model.dto.ArmorDTO;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.PotionDTO;
import com.kkpjj.sysostory.model.dto.WeaponDTO;

public class InventoryService {
	
	private InventoryDAO inventoryDAO;
	
	public InventoryService() {
		this.inventoryDAO = new InventoryDAO();
	}
	
	public List<WeaponDTO> WeaponListInfo() {
		
		Connection con = getConnection();
		
		List<WeaponDTO> weaponList = inventoryDAO.getWeaponInfo(con);
		
		close(con);
		
		return weaponList;
	}

	public List<ArmorDTO> ArmorListInfo() {
		
		Connection con = getConnection();
		
		List<ArmorDTO> armorList = inventoryDAO.getArmorInfo(con);
		
		return armorList;
	}

	public List<PotionDTO> PotionListInfo() {
		
		Connection con = getConnection();
		
		List<PotionDTO> potionList = inventoryDAO.getPotionInfo(con);
		
		return potionList;
	}

	public CharacterDTO EquipInfo() {
		CharacterDTO equip = new CharacterDTO();
		return equip;
	}

}
