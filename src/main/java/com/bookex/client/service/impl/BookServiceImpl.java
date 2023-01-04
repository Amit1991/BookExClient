package com.bookex.client.service.impl;

import com.bookex.client.model.Book;
import com.bookex.client.repository.BookRepo;
import com.bookex.client.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public List<Book> getAllBooks() {

        return bookRepo.getAllBooks();
    }
}
