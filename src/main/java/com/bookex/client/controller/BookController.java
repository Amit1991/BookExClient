package com.bookex.client.controller;

import com.bookex.client.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("books")
public class BookController {

    @Autowired
    private IBookService bookService;

    public String getAllBooks(Model model) {

        model.addAttribute("allBooks", bookService.getAllBooks());
        return "books/allBooks";
    }
}
