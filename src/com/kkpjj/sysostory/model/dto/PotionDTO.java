package com.kkpjj.sysostory.model.dto;

public class PotionDTO {
	
	private int potionCode;
	private String Name;
	private int price;
	private int stats;
	private String script;
	
	
	public PotionDTO() {}


	public PotionDTO(int potionCode, String name, int price, int stats, String script) {
		super();
		this.potionCode = potionCode;
		Name = name;
		this.price = price;
		this.stats = stats;
		this.script = script;
	}


	public int getPotionCode() {
		return potionCode;
	}


	public String getName() {
		return Name;
	}


	public int getPrice() {
		return price;
	}


	public int getStats() {
		return stats;
	}


	public String getScript() {
		return script;
	}


	public void setPotionCode(int potionCode) {
		this.potionCode = potionCode;
	}


	public void setName(String name) {
		Name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setStats(int stats) {
		this.stats = stats;
	}


	public void setScript(String script) {
		this.script = script;
	}


	@Override
	public String toString() {
		return "PotionDTO [potionCode=" + potionCode + ", Name=" + Name + ", price=" + price + ", stats=" + stats
				+ ", script=" + script + "]";
	}
	
}
