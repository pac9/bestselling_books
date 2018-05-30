package com.example.pauline.topsellingbookslist;

import java.util.ArrayList;

public class BestSellingBooks {

    private ArrayList<Book> list;

    public BestSellingBooks(){
        list = new ArrayList<>();
        list.add(new Book (1, "Don Quixote", 1605));
        list.add(new Book (2, "A Tale of Two Cities", 1859));
        list.add(new Book(3, "The Lord of the Rings", 1954));
        list.add(new Book (4, "The Little Prince", 1943));
        list.add(new Book(5, "Harry Potter and the Philosophers Stone", 1997));
        list.add(new Book(6, "The Hobbit", 1937));
        list.add(new Book(7, "And Then There Were None", 1939));
        list.add(new Book(8, "Dream of the Red Chamber", 1754));
        list.add(new Book(9, "Alice's Adventures in Wonderland", 1865));
        list.add(new Book(10, "The Lion, the witch and the Wardrobe", 1950));
        list.add(new Book(11, "She: A History of Adventure", 1887));
        list.add(new Book(12, "The Adventures of Pinocchio", 1881));
        list.add(new Book(13, "The Da Vin Code", 2003));
        list.add(new Book(14, "Harry Potter and the Chamber of Secrets", 1998));
        list.add(new Book(15, "Harry Potter and the Prisoner of ban", 1999));
    }

    public ArrayList<Book> getList() {
        return new ArrayList<>(list);
    }
}
