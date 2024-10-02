package org.example.cs545homework02.service.Impl;

import org.example.cs545homework02.model.Book;
import org.example.cs545homework02.repository.BookRepository;
import org.example.cs545homework02.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(int id) {
        return bookRepository.findById(id);
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Optional<Book> updateBook(int id, Book updatedBook) {
        return bookRepository.findById(id).map(exisitingBook -> {
            exisitingBook.setTitle(updatedBook.getTitle());
            exisitingBook.setPrice(updatedBook.getPrice());
            exisitingBook.setIsbn(updatedBook.getIsbn());
            return bookRepository.save(exisitingBook);
        });
    }

    @Override
    public void deleteBookById(int id) {
        bookRepository.deleteById(id);
    }






}
