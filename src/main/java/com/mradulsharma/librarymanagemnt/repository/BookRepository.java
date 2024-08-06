package com.mradulsharma.librarymanagemnt.repository;

import com.mradulsharma.librarymanagemnt.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
