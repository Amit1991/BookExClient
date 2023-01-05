package com.bookex.client.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.time.Year;

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank @NotEmpty @NotNull
    @Size(min = 10, max = 10, message = "ISBN-10 Must be a 10 character value.")
    private String isbn10;
    @NotBlank @NotEmpty @NotNull
    @Size(min = 13, max = 13, message = "ISBN-13 Must be a 13 character value.")
    private String isbn13;

    @NotBlank @NotEmpty @NotNull
    private String title;

    @PastOrPresent(message = "Publishing year can not be a future year.")
    private Year publishingYear;

    @Min(value = 1, message = "Edition cannot be less than 1.")
    private int edition;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Year getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Year publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public Book(Long id, String isbn10, String isbn13, String title, Year publishingYear, int edition) {
        this.id = id;
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
        this.title = title;
        this.publishingYear = publishingYear;
        this.edition = edition;
    }

    public Book() {

    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn10='" + isbn10 + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", title='" + title + '\'' +
                ", publishingYear=" + publishingYear +
                ", edition=" + edition +
                '}';
    }
}
