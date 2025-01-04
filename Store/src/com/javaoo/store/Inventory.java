package com.javaoo.store;

public class Inventory {
	public static void produceReport(Item[] items) {
		System.out.println("The current inventory:");
		int itemIdx = 0, itemsQuantity = 0;
		double totalPrice = 0;
		for (Item item: items) {
			System.out.printf("%d. %s\n", itemIdx, item.toString());
			itemsQuantity += item.getQuantity();
			totalPrice += item.getPrice();
			itemIdx++;
		}
		System.out.printf("Total items quantity: %d\n", itemsQuantity);
		System.out.printf("Sum of items' prices: $%.2f\n", totalPrice);
		System.out.println("=============================");
	}
}
