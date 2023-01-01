package com.masai.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.masai.app.entity.Book;

import jakarta.annotation.PostConstruct;

@Component
public class bookservice {
	List<Book> books=new ArrayList<Book>();
	
	@PostConstruct
	public void addBooks() {
		books.add(new Book(1,"Harry Potter 1","Jk Rowling"));
		books.add(new Book(2,"Harry Potter 2","Jk Rowling"));
		books.add(new Book(3,"Harry Potter 3","Jk Rowling"));
		books.add(new Book(4,"Harry Potter 4","Jk Rowling"));
		books.add(new Book(5,"Harry Potter 5","Jk Rowling"));
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public Book findBook(int id) {
		for(Book i:books) {
			if(i.getId()==id)
				return i;
		}
		return null;
	}
	
	public List<Book> deleteBook(int id) {
		Book found=findBook(id);
		books.remove(found);
		return getBooks();
	}
}
