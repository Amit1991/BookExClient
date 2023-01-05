package com.bookex.client.controller;

import com.bookex.client.model.Book;
import com.bookex.client.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @RequestMapping("getAll")
    public String getAllBooks(Model model) {

        model.addAttribute("allBooks", bookService.getAllBooks());
        return "books/allBooks";
    }

    @RequestMapping(method = RequestMethod.GET, path = "addBook")
    public String addBookGet(Model model) {

        model.addAttribute("book", new Book());
        return "books/addBook";
    }

    @RequestMapping(method = RequestMethod.POST, path = "addBook")
    public String addBookPost(@ModelAttribute Book book, Model model) {

        model.addAttribute("allBooks", bookService.getAllBooks().add(book));
        return "books/allBooks";
    }
}
