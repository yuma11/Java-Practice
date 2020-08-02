package com.sample;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		System.out.println("比較：" + b1.getTitle() + b1.getPrice() + " - " + b2.getTitle() + b2.getPrice() + " = " + (b1.getPrice() - b2.getPrice()));
		return b1.getPrice() - b2.getPrice();
	}
}
