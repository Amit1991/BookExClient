package com.bookex.client.util;

import com.bookex.client.model.Book;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.time.Year;
import java.util.List;
import java.util.function.Supplier;

@Component
public class BookSupplier implements Supplier<List<Book>> {

    @Override
    public List<Book> get() {

        return List.of(

                new Book(1l,"1234567890", "1234567890123", "Amélie", Year.of(1997), 3),
                new Book(2l,"1234567891", "1234567890124", "Hunger Games", Year.of(2003), 7),
                new Book(3l,"1234567893", "1234567890129", "Plague", Year.of(1954), 18),
                new Book(4l,"1234567898", "1234567890127", "Nausea", Year.of(1963), 11)
        );
    }
}
