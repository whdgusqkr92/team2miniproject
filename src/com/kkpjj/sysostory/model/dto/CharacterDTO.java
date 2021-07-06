package com.kkpjj.sysostory.model.dto;

public class CharacterDTO implements java.io.Serializable {
	
	private int chrCode;
	private int userNo;
	private String chrName;
 	private int chrHp;
	private int chrMp;
	private int chrExp;
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
	private String chrEquipArmor;
	
	public CharacterDTO() {}

	public CharacterDTO(int chrCode, int userNo, String chrName, int chrHp, int chrMp, int chrExp, int chrLevel,
			int chrGold, int chrMaxHp, int chrMaxMp, int chrMaxExp, int chrChrAtt, int chrDet, String chrSfx,
			String chrBmg, String chrEquipTitle, String chrEquipWeapon, String chrEquipArmor) {
		super();
		this.chrCode = chrCode;
		this.userNo = userNo;
		this.chrName = chrName;
		this.chrHp = chrHp;
		this.chrMp = chrMp;
		this.chrExp = chrExp;
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
		this.chrEquipArmor = chrEquipArmor;
	}

	public int getChrCode() {
		return chrCode;
	}

	public int getUserNo() {
		return userNo;
	}

	public String getChrName() {
		return chrName;
	}

	public int getChrHp() {
		return chrHp;
	}

	public int getChrMp() {
		return chrMp;
	}

	public int getChrExp() {
		return chrExp;
	}

	public int getChrLevel() {
		return chrLevel;
	}

	public int getChrGold() {
		return chrGold;
	}

	public int getChrMaxHp() {
		return chrMaxHp;
	}

	public int getChrMaxMp() {
		return chrMaxMp;
	}

	public int getChrMaxExp() {
		return chrMaxExp;
	}

	public int getChrChrAtt() {
		return chrChrAtt;
	}

	public int getChrDet() {
		return chrDet;
	}

	public String getChrSfx() {
		return chrSfx;
	}

	public String getChrBmg() {
		return chrBmg;
	}

	public String getChrEquipTitle() {
		return chrEquipTitle;
	}

	public String getChrEquipWeapon() {
		return chrEquipWeapon;
	}

	public String getChrEquipArmor() {
		return chrEquipArmor;
	}

	public void setChrCode(int chrCode) {
		this.chrCode = chrCode;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public void setChrName(String chrName) {
		this.chrName = chrName;
	}

	public void setChrHp(int chrHp) {
		this.chrHp = chrHp;
	}

	public void setChrMp(int chrMp) {
		this.chrMp = chrMp;
	}

	public void setChrExp(int chrExp) {
		this.chrExp = chrExp;
	}

	public void setChrLevel(int chrLevel) {
		this.chrLevel = chrLevel;
	}

	public void setChrGold(int chrGold) {
		this.chrGold = chrGold;
	}

	public void setChrMaxHp(int chrMaxHp) {
		this.chrMaxHp = chrMaxHp;
	}

	public void setChrMaxMp(int chrMaxMp) {
		this.chrMaxMp = chrMaxMp;
	}

	public void setChrMaxExp(int chrMaxExp) {
		this.chrMaxExp = chrMaxExp;
	}

	public void setChrChrAtt(int chrChrAtt) {
		this.chrChrAtt = chrChrAtt;
	}

	public void setChrDet(int chrDet) {
		this.chrDet = chrDet;
	}

	public void setChrSfx(String chrSfx) {
		this.chrSfx = chrSfx;
	}

	public void setChrBmg(String chrBmg) {
		this.chrBmg = chrBmg;
	}

	public void setChrEquipTitle(String chrEquipTitle) {
		this.chrEquipTitle = chrEquipTitle;
	}

	public void setChrEquipWeapon(String chrEquipWeapon) {
		this.chrEquipWeapon = chrEquipWeapon;
	}

	public void setChrEquipArmor(String chrEquipArmor) {
		this.chrEquipArmor = chrEquipArmor;
	}

	@Override
	public String toString() {
		return "CharacterDTO [chrCode=" + chrCode + ", userNo=" + userNo + ", chrName=" + chrName + ", chrHp=" + chrHp
				+ ", chrMp=" + chrMp + ", chrExp=" + chrExp + ", chrLevel=" + chrLevel + ", chrGold=" + chrGold
				+ ", chrMaxHp=" + chrMaxHp + ", chrMaxMp=" + chrMaxMp + ", chrMaxExp=" + chrMaxExp + ", chrChrAtt="
				+ chrChrAtt + ", chrDet=" + chrDet + ", chrSfx=" + chrSfx + ", chrBmg=" + chrBmg + ", chrEquipTitle="
				+ chrEquipTitle + ", chrEquipWeapon=" + chrEquipWeapon + ", chrEquipArmor=" + chrEquipArmor
				+ ", getChrCode()=" + getChrCode() + ", getUserNo()=" + getUserNo() + ", getChrName()=" + getChrName()
				+ ", getChrHp()=" + getChrHp() + ", getChrMp()=" + getChrMp() + ", getChrExp()=" + getChrExp()
				+ ", getChrLevel()=" + getChrLevel() + ", getChrGold()=" + getChrGold() + ", getChrMaxHp()="
				+ getChrMaxHp() + ", getChrMaxMp()=" + getChrMaxMp() + ", getChrMaxExp()=" + getChrMaxExp()
				+ ", getChrChrAtt()=" + getChrChrAtt() + ", getChrDet()=" + getChrDet() + ", getChrSfx()=" + getChrSfx()
				+ ", getChrBmg()=" + getChrBmg() + ", getChrEquipTitle()=" + getChrEquipTitle()
				+ ", getChrEquipWeapon()=" + getChrEquipWeapon() + ", getChrEquipArmor()=" + getChrEquipArmor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
