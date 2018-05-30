package com.example.pauline.topsellingbookslist;

public class Book {

    private int ranking;
    private String title;
    private int yearPublished;

    public Book(int ranking, String title, int yearPublished){
        this.ranking = ranking;
        this.title = title;
        this.yearPublished = yearPublished;
    }


    public int getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }


    public int getYearPublished() {
        return yearPublished;
    }
}
