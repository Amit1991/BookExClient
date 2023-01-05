package com.bookex.client.controller;

import com.bookex.client.model.Book;
import com.bookex.client.service.IBookService;
import com.bookex.client.util.BookSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(method = RequestMethod.POST, path = "addBookPost")
    public String addBookPost(@ModelAttribute("book") Book book,
                              BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {

            return "books/addBook";
        }

        List<Book> bookList = new ArrayList<>();
        bookList.addAll(bookService.getAllBooks());
        bookList.add(book);
        model.addAttribute("allBooks", bookList);
        return "books/allBooks";
    }
}
