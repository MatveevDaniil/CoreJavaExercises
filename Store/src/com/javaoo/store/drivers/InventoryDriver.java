package com.javaoo.store.drivers;

import com.javaoo.store.Item;

import com.javaoo.store.Book;
import com.javaoo.store.CD;
import com.javaoo.store.ClassicalCD;
import com.javaoo.store.Artist;
import com.javaoo.store.Inventory;
import java.util.Date;

import java.util.ArrayList;
import java.util.List;

public class InventoryDriver {

	public static void main(String[] args) {
		Item[] myInventory = new Item[6];
		myInventory[0] = new Book(
				"War and Peace", 1, 10.15, "Leo Tolstoy", "publisher1", "Historical Novel");
		myInventory[1] = new Book(
				"Idiot", 10, 8.0, "Dostoevsky", "publisher1", "Novel");
		myInventory[2] = new Book(
				"Blindsight", 20, 5, "Peter Watts", "publisher2", "Science Fiction");
		myInventory[3] = new Book(
				"Calculus 1", 3, 6.1, "Baderko", "Springer", "Math");
		myInventory[4] = new CD(
				"Angel Miners", 10, 4.1, new Artist("Awoolnation"), new Date("24/05/2020"));
		myInventory[5] = new ClassicalCD(
				"Mala nocna muzika", 1, 7.12, 
				"Somebody",
				new String[] {"Guitarist1", "Pianist2"},
				"Sweden",
				new Date("25/09/2017"));
		Inventory.produceReport(myInventory);
		
		List<Book> bookList = new ArrayList<>();
		bookList.add((Book) myInventory[0]);
		bookList.add((Book) myInventory[1]);
		bookList.add((Book) myInventory[2]);
		bookList.add((Book) myInventory[3]);
		Book.saveBookList(bookList, "bookList.csv");
		
		List<Book> bookListCopy = Book.getBookList("bookList.csv");
		Inventory.produceReport(bookListCopy.toArray(new Book[0]));
	}

}
