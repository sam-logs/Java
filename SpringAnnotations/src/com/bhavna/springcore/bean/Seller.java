package com.bhavna.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Seller {
	private String name;
	private int sId;
	private Buyer buy;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public Buyer getBuy() {
		return buy;
	}

	public void setBuy(Buyer buy) {
		this.buy = buy;
	}
	
	@Override
	public String toString() {
		return "Seller [name=" + name + ", sId=" + sId + ", buy=" + buy + "]";
	}
	
	//autowired seller with buyer 
	
	@Autowired
	public Seller(Buyer buy) {
		this.buy = buy;
	}

	
	public Seller() {
		super();
	}

	public Seller(String name, int sId, Buyer buy) {
		super();
		this.name = name;
		this.sId = sId;
		this.buy = buy;
	}
	
	
}
