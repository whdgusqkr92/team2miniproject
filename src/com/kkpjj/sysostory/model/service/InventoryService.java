package com.kkpjj.sysostory.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kkpjj.sysostory.model.dto.ArmorDTO;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.PotionDTO;
import com.kkpjj.sysostory.model.dto.WeaponDTO;

public class InventoryService {

	public List<WeaponDTO> WeaponListInfo() {
		
		WeaponDTO wItem1 = new WeaponDTO();
		
		List<WeaponDTO> weaponList = new ArrayList<>();
		
		return weaponList;
	}

	public List<ArmorDTO> ArmorListInfo() {
		
		ArmorDTO aItem1 = new ArmorDTO();
		
		List<ArmorDTO> armorList = new ArrayList<>();
		return null;
	}

	public List<PotionDTO> PotionListInfo() {
		
		PotionDTO pItem1 = new PotionDTO();
		
		List<PotionDTO> potionList = new ArrayList<>();
		
		return potionList;
	}

	public CharacterDTO EquipInfo() {
		CharacterDTO equip = new CharacterDTO();
		return equip;
	}

}
