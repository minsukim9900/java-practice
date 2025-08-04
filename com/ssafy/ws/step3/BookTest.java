package com.ssafy.ws.step3;

public class BookTest {
    public static void main(String[] args) {
        BookManager bm = new BookManager();
        bm.add(new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법"));
        bm.add(new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용"));
        bm.add(new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 응용"));

        System.out.println("**********************도서목록**********************");
        Book[] books = bm.getList();
        for(Book b : books) {
            System.out.println(b);
        }

        System.out.println("**********************도서 조회: 21424**********************");
        Book book = bm.serachByIsbn("21424");
        System.out.println(book);
        System.out.println("**********************도서 삭제: 21424**********************");
        bm.remove("21424");

        System.out.println("**********************도서목록**********************");
        books = bm.getList();
        for(Book b : books) {
            System.out.println(b);
        }
    }
}
