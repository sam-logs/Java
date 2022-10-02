package com.bhavna.springcore.bean;

public class Buyer {
	private String name;
	private int bId;
	private String item;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Buyer(String name, int bId, String item) {
		super();
		this.name = name;
		this.bId = bId;
		this.item = item;
	}

	public Buyer() {
		super();
	}

	@Override
	public String toString() {
		return "Buyer [name=" + name + ", bId=" + bId + ", item=" + item + "]";
	}

}
