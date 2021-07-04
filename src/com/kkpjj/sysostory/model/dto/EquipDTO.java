package com.kkpjj.sysostory.model.dto;

public class EquipDTO implements java.io.Serializable{
	
	private int chrCode;
	private int equipWeapon;
	private int equipArmor;
	
	public EquipDTO() {}

	public EquipDTO(int chrCode, int equipWeapon, int equipArmor) {
		super();
		this.chrCode = chrCode;
		this.equipWeapon = equipWeapon;
		this.equipArmor = equipArmor;
	}

	public int getChrCode() {
		return chrCode;
	}

	public void setChrCode(int chrCode) {
		this.chrCode = chrCode;
	}

	public int getEquipWeapon() {
		return equipWeapon;
	}

	public void setEquipWeapon(int equipWeapon) {
		this.equipWeapon = equipWeapon;
	}

	public int getEquipArmor() {
		return equipArmor;
	}

	public void setEquipArmor(int equipArmor) {
		this.equipArmor = equipArmor;
	}

	@Override
	public String toString() {
		return "EquipDTO [chrCode=" + chrCode + ", equipWeapon=" + equipWeapon + ", equipArmor=" + equipArmor + "]";
	}

}



