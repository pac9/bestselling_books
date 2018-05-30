package com.example.pauline.topsellingbookslist;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class BestSellingBooksAdapter extends ArrayAdapter<Book>{

    public BestSellingBooksAdapter(Context context, ArrayList<Book> books){
        super(context, 0, books);
    }


}
