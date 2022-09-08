package com.csform.businessportfolio.model;

public class LeftMenuItem {
	
	public static final long LEFT_MENU_ABOUT = 12;
	public static final long LEFT_MENU_OUR_TEAM = 13;
	public static final long LEFT_MENU_CLIENTS = 14;
	public static final long LEFT_MENU_CONTACT = 15;

	
	private int icon;
	private String name;
	private long tag;
	
	public LeftMenuItem(int icon, String name, long tag) {
		this.icon = icon;
		this.name = name;
		this.tag = tag;
	}

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTag() {
		return tag;
	}
	public void setTag(long tag) {
		this.tag = tag;
	}
}
