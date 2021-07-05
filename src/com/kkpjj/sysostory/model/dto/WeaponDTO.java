package com.kkpjj.sysostory.model.dto;

public class WeaponDTO {
	
	private int weaponCode;
	private String name;
	private int price;
	private int stats;
	private String script;
	
	public WeaponDTO() {}

	public WeaponDTO(int weaponCode, String name, int price, int stats, String script) {
		super();
		this.weaponCode = weaponCode;
		this.name = name;
		this.price = price;
		this.stats = stats;
		this.script = script;
	}

	public int getWeaponCode() {
		return weaponCode;
	}

	public String getName() {
		return name;
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

	public void setWeaponCode(int weaponCode) {
		this.weaponCode = weaponCode;
	}

	public void setName(String name) {
		this.name = name;
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
		return "WeaponDTO [weaponCode=" + weaponCode + ", name=" + name + ", price=" + price + ", stats=" + stats
				+ ", script=" + script + "]";
	}

}
