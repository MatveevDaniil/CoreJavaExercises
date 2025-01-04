package com.javaoo.store;

import java.util.List;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.io.File;

public class Book extends Item {
	private String author, publisher, category;
	
	/**
	 * @param title
	 * @param quantity
	 * @param price
	 * @param author
	 * @param publisher
	 * @param category
	 */
	public Book(
			String title, int quantity, double price, 
			String author, String publisher, String category) {
		super(title, quantity, price);
		setAuthor(author);
		setPublisher(publisher);
		setCategory(category);
	}
	
	public String getRecord() {
		String record = String.format(
				"%s,%s,%s,%s,%s,%s", 
				getTitle(), getQuantity(), getPrice(), 
				getAuthor(), getPublisher(), getCategory());
		return record;
	}
	
	public static void saveBookList(List<Book> bookList, String fileName) {
		String heading = "title,quantity,price,author,publisher,category\n";
		try (PrintWriter writer = new PrintWriter(fileName)) {
			writer.print(heading);
			for (Book book : bookList)
				writer.println(book.getRecord());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Book> getBookList(String fileName) {
		List<Book> bookList = new ArrayList<>();
		String requiredHeading = "title,quantity,price,author,publisher,category";
		try (Scanner reader = new Scanner(new File(fileName))) {
			String heading = reader.nextLine();
			if (!heading.equals(requiredHeading)) {
				throw new DataFormatException(
						"Error while processing file `" + fileName + "`.\n" + 
						"Required data storage format: `" + requiredHeading + "`\n" +
					    "Your file heading: `" + heading + "`");
			}
			int lineIdx = 1;
			while (reader.hasNextLine()) {
				String[] fields = reader.nextLine().split(",");
				if (fields.length != 6) 
					throw new DataFormatException(
							"Error while processing file `" + fileName + "`." + 
							"Less than 6 lines in line " + lineIdx);
				String title = fields[0];
				int quantity = Integer.parseInt(fields[1]);
				double price = Double.parseDouble(fields[2]);	
				String author = fields[3];
				String publisher = fields[4];
				String category = fields[5];
				bookList.add(new Book(title, quantity, price, author, publisher, category));
				lineIdx++;
			}
		}  catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}
	
	public void setAuthor(String author) { this.author = author; }
	public String getAuthor() { return author;}
	
	public void setPublisher(String publisher) { this.publisher = publisher; }
	public String getPublisher() { return publisher; }
	
	public String getCategory() { return category; }
	public void setCategory(String category) { this.category = category; }
}