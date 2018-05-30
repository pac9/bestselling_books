package com.example.pauline.topsellingbookslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        Intent intent = getIntent();
        Book book = (Book)intent.getSerializableExtra("book");
        Log.d("BooksActivity: ", book.getTitle());

    }
}
