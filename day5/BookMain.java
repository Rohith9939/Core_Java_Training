package com.celcom.day5;
 
 
import java.util.ArrayList;
 
class Book {
     String title;
     String author;
     String isbn;
 
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
 
    
    public String getTitle() {
        return title;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public String getIsbn() {
        return isbn;
    }
 
    
    public String write() {
        return "Title: " + title + "Author: " + author + "ISBN: " + isbn ;
    }
}
 
class Library {
    ArrayList<Book> collection= new ArrayList<>();
 
    
    public void addBook(Book book) {
    	collection.add(book);
        System.out.println("Book added : " + book.write());
    }
 
    public void removeBook(String isbn) {
        for (Book book : collection) {
            if (book.getIsbn().equals(isbn)) {
            	collection.remove(book);
                System.out.println("Book removed : " + book.write());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
      
    }    
    public void displayBooks() {
            System.out.println("\nBooks in the collection:");
            for (Book book : collection) {
                System.out.println(book.write());
            }
    }
}
 
public class BookMain {
    public static void main(String[] args) {
        Library library = new Library();
 
        
        Book book1 = new Book("Book1 ", "Author1 ", "123");
        Book book2 = new Book("Book2 ", "Author2 ", "456");
 
        
        library.addBook(book1);
        library.addBook(book2);
 
        library.removeBook("123");
        library.displayBooks();
        
        
    }
}
 