package com.example.pauline.topsellingbookslist;

import java.io.Serializable;

public class Book implements Serializable{

    private Integer ranking;
    private String title;
    private Integer yearPublished;

    public Book(Integer ranking, String title, Integer yearPublished){
        this.ranking = ranking;
        this.title = title;
        this.yearPublished = yearPublished;
    }


    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }


    public Integer getYearPublished() {
        return yearPublished;
    }
}
