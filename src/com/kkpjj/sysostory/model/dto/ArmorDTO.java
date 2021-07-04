package com.kkpjj.sysostory.model.dto;

public class ArmorDTO {
	
	private int ArmorCode;
	private String Name;
	private int price;
	private int stats;
	private String script;
	
	public ArmorDTO() {}

	public ArmorDTO(int armorCode, String name, int price, int stats, String script) {
		super();
		ArmorCode = armorCode;
		Name = name;
		this.price = price;
		this.stats = stats;
		this.script = script;
	}

	public int getArmorCode() {
		return ArmorCode;
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

	public void setArmorCode(int armorCode) {
		ArmorCode = armorCode;
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
		return "ArmorDTO [ArmorCode=" + ArmorCode + ", Name=" + Name + ", price=" + price + ", stats=" + stats
				+ ", script=" + script + "]";
	}

}
