package com.ssafy.ws.step3;

import java.util.ArrayList;
import java.util.List;

public class BookManagerImpl implements IBookManager {
    private static final int MAX_SIZE = 100;
    Book[] books = new Book[MAX_SIZE];
    int size = 0;

    private BookManagerImpl() {}

    private static class Holder {
        private static final BookManagerImpl INSTANCE = new BookManagerImpl();
    }

    public static IBookManager getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public void add(Book book) {
        if (size == MAX_SIZE) {
            System.out.println("도서 양이 최대입니다.");
            return;
        }
        books[size++] = book;
    }

    @Override
    public void remove(String isbn) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                index = i;
            }
        }

        for (int i = index + 1; i < size; i++) {
            books[i - 1] = books[i];
        }
        size--;
    }

    @Override
    public Book[] getList() {
        Book[] result = new Book[size];
        System.arraycopy(books, 0, result, 0, size);
        return result;
    }



    @Override
    public Book searchByIsbn(String isbn) {
        for (Book book : books) {
            if (book != null && book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book[] searchByTitle(String title) {
        List<Book> matched = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (books[i] != null && books[i].getTitle().contains(title)) {
                matched.add(books[i]);
            }
        }
        return matched.toArray(new Book[0]);
    }

    @Override
    public Magazine[] getMagazines() {
        List<Magazine> mags = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            if(books[i] instanceof Magazine) {
                mags.add((Magazine)books[i]);
            }
        }
        return mags.toArray(new Magazine[0]);
    }

    @Override
    public Book[] getBooks() {
        List<Book> normal = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            if(!(books[i] instanceof Magazine)) {
                normal.add(books[i]);
            }
        }
        return normal.toArray(new Book[0]);
    }

    @Override
    public int getTotalPrice() {
        int price = 0;

        for(int i = 0; i < size; i++) {
            if(books[i] != null) {
                price += books[i].getPrice();
            }
        }
        return price;
    }

    @Override
    public double getPriceAvg() {
        if(size == 0) {
            return 0.0;
        }
        int price = getTotalPrice();
        return (double)price / size;
    }
}
