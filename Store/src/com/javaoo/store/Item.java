package com.javaoo.store;

public class Item {
	private String title;
	private int quantity;
	private double price;

	public Item() {}

	/**
	 * @param title
	 * @param quantity
	 * @param price
	 */
	public Item(String title, int quantity, double price) {
		setTitle(title);
		setPrice(price);
		setQuantity(quantity);
	}
	
	@Override
	public String toString() {
		return String.format("Title=%s, Price=%.2f, Quantity=%d", getTitle(), getPrice(), getQuantity());
	}
	
	public void setTitle(String title) { this.title = title; }
	public String getTitle() { return title; }
	public void setQuantity(int quantity) { this.quantity = quantity; }
	public int getQuantity() { return quantity; }
	public void setPrice(double price) { this.price = price; }
	public double getPrice() { return price; }

}
