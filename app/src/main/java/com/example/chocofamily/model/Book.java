package com.example.chocofamily.model;

import java.util.Comparator;

public class Book implements Comparable<Book>{

    String name;
    int pagesCount;
    int price;

    public Book(String name, int pagesCount, int price) {
        this.name = name;
        this.pagesCount = pagesCount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book book2) {
        return getPagesCount()-book2.getPagesCount();
    }


}
