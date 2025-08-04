package com.ssafy.ws.step3;

import java.util.ArrayList;
import java.util.List;

public class BookManagerImpl implements IBookManager {

    private final List<Book> books = new ArrayList<>();

    private BookManagerImpl() {
    }

    private static class Holder {
        private static final BookManagerImpl INSTANCE = new BookManagerImpl();
    }

    public static IBookManager getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public void add(Book book) {
        if (book == null) return;

        if (searchByIsbn(book.getIsbn()) != null) {
            System.out.println("이미 존재하는 ISBN 입니다.");
            return;
        }
        books.add(book);
    }

    @Override
    public void remove(String isbn) {
        if (isbn == null) return;
        for (int i = books.size() - 1; i >= 0; i--) {
            if (books.get(i) != null && books.get(i).getIsbn().equals(isbn)) {
                books.remove(i);
            }
        }
    }

    @Override
    public Book[] getList() {
        return books.toArray(new Book[0]);
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
        if (title == null) return new Book[0];
        List<Book> matched = new ArrayList<>();
        for (Book b : books) {
            if (b != null && b.getTitle() != null && b.getTitle().contains(title)) {
                matched.add(b);
            }
        }
        return matched.toArray(new Book[0]);
    }

    @Override
    public Magazine[] getMagazines() {
        List<Magazine> mags = new ArrayList<>();
        for (Book b : books) {
            if (b instanceof Magazine) {
                mags.add((Magazine) b);
            }
        }
        return mags.toArray(new Magazine[0]);
    }

    @Override
    public Book[] getBooks() {
        List<Book> normal = new ArrayList<>();
        for (Book b : books) {
            if (b != null && !(b instanceof Magazine)) {
                normal.add(b);
            }
        }
        return normal.toArray(new Book[0]);
    }

    @Override
    public int getTotalPrice() {
        int sum = 0;
        for (Book b : books) {
            if (b != null) {
                sum += b.getPrice();
            }
        }
        return sum;
    }

    @Override
    public double getPriceAvg() {
        if (books.isEmpty()) return 0.0;
        return (double) getTotalPrice() / books.size();
    }
}
