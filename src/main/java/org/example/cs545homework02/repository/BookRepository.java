package org.example.cs545homework02.repository;

import org.example.cs545homework02.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
