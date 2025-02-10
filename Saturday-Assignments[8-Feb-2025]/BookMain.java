package com.celcom.day5;

import java.util.ArrayList;

class Book{
	String title;
	String author;
	String isbn;
	
	Book(String title, String author, String isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	String write() {
		return "title : " + title + "author : " + author + "ISBN : " + isbn;
	}
	
}

class Library {
	ArrayList<Book> books = new ArrayList<>();
	
	void addBooks(String name, String author, String isbn) {
		Book newBook = new Book(name, author, isbn);
		books.add(newBook);
	}
	
	void removeBook(String isbn) {
		for(Book book: books) {
			if(book.isbn.equals(isbn)) {
				books.remove(book);
				System.out.println("The book removed: \n" + book.write());
				return;
			}
		}
		System.out.println("The book with ISBN " + isbn + " not found");
	}
	
	void displayBooks() {
		System.out.println("\nThe books are available in Library : ");
		for(Book book : books) {
			System.out.println(book.write());
		}
		
		System.out.println("------------------------------------\n");
	}
}
public class BookMain {
	public static void main(String[] args) {
		Library library = new Library();
		library.addBooks("Book1", "A", "123");
		library.addBooks("Book2", "B", "456");
		library.addBooks("Book3", "C", "789");
		
		library.displayBooks();
		
		library.removeBook("456");
		
		library.displayBooks();
		
	}

}
