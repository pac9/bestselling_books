package com.example.pauline.topsellingbookslist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestSellingBooksTest {

    @Test
    public void getListTest() {
        BestSellingBooks bestSellingBooks = new BestSellingBooks();
        assertEquals(15, bestSellingBooks.getList().size());
    }
}
