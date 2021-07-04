package com.kkpjj.sysostory.model.dto;

public class InventoryDTO implements java.io.Serializable {
	
	private int chrCode;
	private int gold;
	private int inven1;
	private int inven2;
	private int inven3;
	private int inven4;
	private int inven5;
	private int inven6;
	private int inven7;
	private int inven8;
	private int inven9;
	private int inven10;
	private int inven11;
	private int inven12;
	
	public InventoryDTO() {}

	public InventoryDTO(int chrCode, int gold, int inven1, int inven2, int inven3, int inven4, int inven5, int inven6,
			int inven7, int inven8, int inven9, int inven10, int inven11, int inven12) {
		super();
		this.chrCode = chrCode;
		this.gold = gold;
		this.inven1 = inven1;
		this.inven2 = inven2;
		this.inven3 = inven3;
		this.inven4 = inven4;
		this.inven5 = inven5;
		this.inven6 = inven6;
		this.inven7 = inven7;
		this.inven8 = inven8;
		this.inven9 = inven9;
		this.inven10 = inven10;
		this.inven11 = inven11;
		this.inven12 = inven12;
	}

	public int getChrCode() {
		return chrCode;
	}

	public void setChrCode(int chrCode) {
		this.chrCode = chrCode;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getInven1() {
		return inven1;
	}

	public void setInven1(int inven1) {
		this.inven1 = inven1;
	}

	public int getInven2() {
		return inven2;
	}

	public void setInven2(int inven2) {
		this.inven2 = inven2;
	}

	public int getInven3() {
		return inven3;
	}

	public void setInven3(int inven3) {
		this.inven3 = inven3;
	}

	public int getInven4() {
		return inven4;
	}

	public void setInven4(int inven4) {
		this.inven4 = inven4;
	}

	public int getInven5() {
		return inven5;
	}

	public void setInven5(int inven5) {
		this.inven5 = inven5;
	}

	public int getInven6() {
		return inven6;
	}

	public void setInven6(int inven6) {
		this.inven6 = inven6;
	}

	public int getInven7() {
		return inven7;
	}

	public void setInven7(int inven7) {
		this.inven7 = inven7;
	}

	public int getInven8() {
		return inven8;
	}

	public void setInven8(int inven8) {
		this.inven8 = inven8;
	}

	public int getInven9() {
		return inven9;
	}

	public void setInven9(int inven9) {
		this.inven9 = inven9;
	}

	public int getInven10() {
		return inven10;
	}

	public void setInven10(int inven10) {
		this.inven10 = inven10;
	}

	public int getInven11() {
		return inven11;
	}

	public void setInven11(int inven11) {
		this.inven11 = inven11;
	}

	public int getInven12() {
		return inven12;
	}

	public void setInven12(int inven12) {
		this.inven12 = inven12;
	}

	@Override
	public String toString() {
		return "InventoryDTO [chrCode=" + chrCode + ", gold=" + gold + ", inven1=" + inven1 + ", inven2=" + inven2
				+ ", inven3=" + inven3 + ", inven4=" + inven4 + ", inven5=" + inven5 + ", inven6=" + inven6
				+ ", inven7=" + inven7 + ", inven8=" + inven8 + ", inven9=" + inven9 + ", inven10=" + inven10
				+ ", inven11=" + inven11 + ", inven12=" + inven12 + "]";
	}


}
