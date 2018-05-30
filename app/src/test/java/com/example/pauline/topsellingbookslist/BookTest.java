package com.example.pauline.topsellingbookslist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book(1, "Don Quixote", 1605);
    }

    @Test
    public void hasRanking(){
        assertEquals(1, book.getRanking());
    }

    @Test
    public void hasTitle(){
        assertEquals("Don Quixote", book.getTitle());
    }

    @Test
    public void hasYearPublished(){
        assertEquals(1605, book.getYearPublished());
    }
}
