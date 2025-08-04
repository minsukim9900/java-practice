package com.ssafy.ws.step3;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int price;
    private String desc;

    public Book() {
    }

    public Book(String isbn, String title, String author, String publisher, int price, String desc) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.desc = desc;
    }

    @Override
    public String toString() {
        // 각각 너비를 맞춰서 출력 (예: id 5, title 10, author 4, publisher 10, price 6, description 15)
        return String.format("%-5s | %-10s | %-4s | %-10s | %6d | %s",
                isbn, title, author, publisher, price, desc);
    }
}
