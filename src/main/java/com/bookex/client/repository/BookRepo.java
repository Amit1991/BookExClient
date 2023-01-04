package com.bookex.client.repository;

import com.bookex.client.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookRepo {

    List<Book> getAllBooks();
}
