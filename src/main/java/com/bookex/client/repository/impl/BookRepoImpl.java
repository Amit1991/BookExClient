package com.bookex.client.repository.impl;

import com.bookex.client.model.Book;
import com.bookex.client.repository.BookRepo;
import com.bookex.client.util.BookSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepoImpl implements BookRepo {

    @Autowired
    private BookSupplier bookSupplier;

    @Override
    public List<Book> getAllBooks() {
        return bookSupplier.get();
    }
}
