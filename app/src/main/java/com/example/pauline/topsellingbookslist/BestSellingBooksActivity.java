package com.example.pauline.topsellingbookslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BestSellingBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_selling_books);

        BestSellingBooks bestSellingBooks = new BestSellingBooks();
        ArrayList<Book> list = bestSellingBooks.getList();

        BestSellingBooksAdapter moviesAdapter = new BestSellingBooksAdapter(this, list);

//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(moviesAdapter);
    }
}
