package com.example.pauline.topsellingbookslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class BestSellingBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_selling_books);

        BestSellingBooks bestSellingBooks = new BestSellingBooks();
        ArrayList<Book> list = bestSellingBooks.getList();

        BestSellingBooksAdapter booksAdapter = new BestSellingBooksAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(booksAdapter);
    }

    public void onListItemClick(View listItem){
        Book book = (Book)listItem.getTag();
        Log.d("Book Title: ", book.getTitle());

        Intent intent = new Intent(this, BooksActivity.class);
        intent.putExtra("book", book);
        startActivity(intent);
    }
}

