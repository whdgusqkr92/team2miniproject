package com.kkpjj.sysostory.controller;

import java.util.List;

import com.kkpjj.sysostory.model.dto.ArmorDTO;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.PotionDTO;
import com.kkpjj.sysostory.model.dto.WeaponDTO;
import com.kkpjj.sysostory.model.service.InventoryService;

public class InventoryController {
	
	private InventoryService invenService = new InventoryService();
	
	public List<WeaponDTO> weaponListInfo() {
		List<WeaponDTO> weaponList = invenService.WeaponListInfo();
		return weaponList;
	}
	
	public List<ArmorDTO> armorListInfo() {
		List<ArmorDTO> armorList = invenService.ArmorListInfo();
		return armorList;
	}
	
	public List<PotionDTO> potionListInfo() {
		List<PotionDTO> potionList = invenService.PotionListInfo();
		return potionList;
	}

	public CharacterDTO EquipInfo() {
		
		CharacterDTO equip = invenService.EquipInfo();
		return equip;
	}
	

}
