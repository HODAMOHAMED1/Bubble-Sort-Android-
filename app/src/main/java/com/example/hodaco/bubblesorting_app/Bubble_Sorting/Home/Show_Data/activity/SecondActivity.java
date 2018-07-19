package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.pojos.DataList;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.presenter.presenter;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.view.HomePresenter_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.view.HomeView_Interface;
import com.example.hodaco.bubblesorting_app.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity implements HomeView_Interface {
    HomePresenter_Interface present;
    @BindView(R.id.list)
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        ButterKnife.bind(this);
        present = new presenter(this);
        present.getAllNumbers();
    }

    @Override
    public void initView() {
        Log.i("hoda", "initview");

    }

    @Override
    public void takeAction(DataList data) {
       array_adaptor adaptor = new array_adaptor(this,R.layout.single_row,R.id.number,data.getList_numbers());
       list.setAdapter(adaptor);
    }
}
