package org.example.cs545homework02.service;

import org.example.cs545homework02.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getAllBooks();

    Optional<Book> getBookById(int id);

    void addBook(Book book);

    Optional<Book> updateBook(int id, Book book);

    void deleteBookById(int id);

}
