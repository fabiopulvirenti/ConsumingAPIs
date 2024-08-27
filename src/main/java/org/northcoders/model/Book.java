package org.northcoders.model;

import java.util.Date;

public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private String description;
    private String image;
    private String isbn;
    private Date published;
    private String publisher;


    public Book(int id, String title, String author, String genre, String description, String image, String isbn, Date published, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.image = image;
        this.isbn = isbn;
        this.published = published;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
