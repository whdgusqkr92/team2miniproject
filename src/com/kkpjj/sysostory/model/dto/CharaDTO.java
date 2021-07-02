package com.kkpjj.sysostory.model.dto;

public class CharaDTO implements java.io.Serializable{
	
	private int chrCode;
	private int userNo;
	private String chrName;
 	private int chrHp;
	private int chrMp;
	private int chrLevel;
	private int chrGold;
	private int chrMaxHp;
	private int chrMaxMp;
	private int chrMaxExp;
	private int chrChrAtt;
	private int chrDet;
	private String chrSfx;
	private String chrBmg;
	private String chrEquipTitle;
	private String chrEquipWeapon;
	private String chrArmor;
	
	public CharaDTO() {}

	public CharaDTO(int chrCode, int userNo, String chrName, int chrHp, int chrMp, int chrLevel, int chrGold,
			int chrMaxHp, int chrMaxMp, int chrMaxExp, int chrChrAtt, int chrDet, String chrSfx, String chrBmg,
			String chrEquipTitle, String chrEquipWeapon, String chrArmor) {
		super();
		this.chrCode = chrCode;
		this.userNo = userNo;
		this.chrName = chrName;
		this.chrHp = chrHp;
		this.chrMp = chrMp;
		this.chrLevel = chrLevel;
		this.chrGold = chrGold;
		this.chrMaxHp = chrMaxHp;
		this.chrMaxMp = chrMaxMp;
		this.chrMaxExp = chrMaxExp;
		this.chrChrAtt = chrChrAtt;
		this.chrDet = chrDet;
		this.chrSfx = chrSfx;
		this.chrBmg = chrBmg;
		this.chrEquipTitle = chrEquipTitle;
		this.chrEquipWeapon = chrEquipWeapon;
		this.chrArmor = chrArmor;
	}

	public int getChrCode() {
		return chrCode;
	}

	public void setChrCode(int chrCode) {
		this.chrCode = chrCode;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getChrName() {
		return chrName;
	}

	public void setChrName(String chrName) {
		this.chrName = chrName;
	}

	public int getChrHp() {
		return chrHp;
	}

	public void setChrHp(int chrHp) {
		this.chrHp = chrHp;
	}

	public int getChrMp() {
		return chrMp;
	}

	public void setChrMp(int chrMp) {
		this.chrMp = chrMp;
	}

	public int getChrLevel() {
		return chrLevel;
	}

	public void setChrLevel(int chrLevel) {
		this.chrLevel = chrLevel;
	}

	public int getChrGold() {
		return chrGold;
	}

	public void setChrGold(int chrGold) {
		this.chrGold = chrGold;
	}

	public int getChrMaxHp() {
		return chrMaxHp;
	}

	public void setChrMaxHp(int chrMaxHp) {
		this.chrMaxHp = chrMaxHp;
	}

	public int getChrMaxMp() {
		return chrMaxMp;
	}

	public void setChrMaxMp(int chrMaxMp) {
		this.chrMaxMp = chrMaxMp;
	}

	public int getChrMaxExp() {
		return chrMaxExp;
	}

	public void setChrMaxExp(int chrMaxExp) {
		this.chrMaxExp = chrMaxExp;
	}

	public int getChrChrAtt() {
		return chrChrAtt;
	}

	public void setChrChrAtt(int chrChrAtt) {
		this.chrChrAtt = chrChrAtt;
	}

	public int getChrDet() {
		return chrDet;
	}

	public void setChrDet(int chrDet) {
		this.chrDet = chrDet;
	}

	public String getChrSfx() {
		return chrSfx;
	}

	public void setChrSfx(String chrSfx) {
		this.chrSfx = chrSfx;
	}

	public String getChrBmg() {
		return chrBmg;
	}

	public void setChrBmg(String chrBmg) {
		this.chrBmg = chrBmg;
	}

	public String getChrEquipTitle() {
		return chrEquipTitle;
	}

	public void setChrEquipTitle(String chrEquipTitle) {
		this.chrEquipTitle = chrEquipTitle;
	}

	public String getChrEquipWeapon() {
		return chrEquipWeapon;
	}

	public void setChrEquipWeapon(String chrEquipWeapon) {
		this.chrEquipWeapon = chrEquipWeapon;
	}

	public String getChrArmor() {
		return chrArmor;
	}

	public void setChrArmor(String chrArmor) {
		this.chrArmor = chrArmor;
	}

	@Override
	public String toString() {
		return "CharaDTO [chrCode=" + chrCode + ", userNo=" + userNo + ", chrName=" + chrName + ", chrHp=" + chrHp
				+ ", chrMp=" + chrMp + ", chrLevel=" + chrLevel + ", chrGold=" + chrGold + ", chrMaxHp=" + chrMaxHp
				+ ", chrMaxMp=" + chrMaxMp + ", chrMaxExp=" + chrMaxExp + ", chrChrAtt=" + chrChrAtt + ", chrDet="
				+ chrDet + ", chrSfx=" + chrSfx + ", chrBmg=" + chrBmg + ", chrEquipTitle=" + chrEquipTitle
				+ ", chrEquipWeapon=" + chrEquipWeapon + ", chrArmor=" + chrArmor + "]";
	}
	
	
	
}
