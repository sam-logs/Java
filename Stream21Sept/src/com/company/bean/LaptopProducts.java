package com.company.bean;

public class LaptopProducts implements Comparable<LaptopProducts> {
	private String company;
	private int product_id;
	private double price;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LaptopProducts(String company, int product_id, double price) {
		this.company = company;
		this.product_id = product_id;
		this.price = price;
	}

	@Override
	public String toString() {
		return "LaptopProducts [company=" + company + ", product_id=" + product_id + ", price=" + price + "]";
	}

	@Override
	public int compareTo(LaptopProducts o) {
		// TODO Auto-generated method stub
		if(price == o.getPrice())
		return 0;
		else if(price > o.getPrice())
			return 1;
		else
			return -1;
	}

	

}
