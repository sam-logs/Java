package com.collection.set;

import java.util.Objects;

public class Book implements Comparable<Book> {
	private int bId;
	private String name;
	private String author;
	private int price;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setSubject(int price) {
		this.price = price;
	}

	public Book(int bId, String name, String author,int price ) {
		this.bId = bId;
		this.name = name;
		this.author = author;
		this.price = price;

	}


	@Override
	public int compareTo(Book obj) {
		if(this.getPrice() < obj.price){
			return 1;
		}else if (this.price > obj.price){
			return -1;
		}else{
			return 0;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bId, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bId == other.bId && Objects.equals(name, other.name)
				&& price == other.price;
	}

}
