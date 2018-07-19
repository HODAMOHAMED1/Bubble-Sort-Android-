package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.activity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.pojos.Data;
import com.example.hodaco.bubblesorting_app.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hoda.CO on 18/07/2018.
 */

public class array_adaptor extends ArrayAdapter {
    ArrayList<Data> data;
    Context cont;
    public array_adaptor(@NonNull Context context, int resource, int textViewResourceId, @NonNull ArrayList<Data> objects) {
        super(context, resource, textViewResourceId, objects);
        data=objects;
        cont=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view =null;
        LayoutInflater inflater = (LayoutInflater) cont.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.single_row,parent,false);
        TextView number = view.findViewById(R.id.number);
        TextView  id = view.findViewById(R.id.id);
        number.setText(String.valueOf(data.get(position).getNumber()));
        id.setText(String.valueOf(data.get(position).getId()));
        return view;

    }
}
