package com.example.pauline.topsellingbookslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BestSellingBooksAdapter extends ArrayAdapter<Book>{

    public BestSellingBooksAdapter(Context context, ArrayList<Book> books){
        super(context, 0, books);
    }


    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.books_item, parent, false);
        }

        Book currentBook = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentBook.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentBook.getTitle().toString());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentBook.getYearPublished().toString());

        listItemView.setTag(currentBook);

        return listItemView;

    }



}
