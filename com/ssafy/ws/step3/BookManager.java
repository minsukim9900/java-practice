package com.ssafy.ws.step3;

public class BookManager {
    private static final int MAX_SIZE = 100;
    Book[] books = new Book[MAX_SIZE];
    int size = 0;

    void add(Book book) {
        books[size++] = book;
    }

    void remove(String isbn) {
        int index = 0;
        for(int i = 0; i < size; i++) {
            if(books[i].getIsbn().equals(isbn)) {
                index = i;
            }
        }

        for(int i = index + 1; i < size; i++) {
            books[i - 1] = books[i];
        }
        size--;
    }

    Book[] getList() {
        Book[] result = new Book[size];
        for(int i = 0; i < size; i++) {
            result[i] = books[i];
        }
        return result;
    }

    Book serachByIsbn(String isbn) {
        for(Book book:books) {
            if(book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
