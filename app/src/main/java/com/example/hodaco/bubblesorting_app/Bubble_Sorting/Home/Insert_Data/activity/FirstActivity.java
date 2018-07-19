package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.pojos.Data;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.presenter.presenter;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view.HomePresenter_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view.HomeView_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.activity.SecondActivity;
import com.example.hodaco.bubblesorting_app.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class FirstActivity extends AppCompatActivity implements HomeView_Interface {
    HomePresenter_Interface presenter;
    @BindView(R.id.number)
    EditText number;
    @BindView(R.id.insertbtn)
    Button insertbtn;
    @BindView(R.id.showbtn)
    Button showbtn;
    AwesomeValidation awesomeValidation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter =new presenter(this);
    }

    @Override
    public void initView() {
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.number, "/^([+-]?[1-9]\\d*|0)$/", R.string.numbererror);
        insertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data data = new Data();
                if(awesomeValidation.validate()) {
                    data.setNumber(Integer.valueOf(number.getText().toString()));
                    presenter.insertNumber(data);
                }
            }
        });

    }

    @Override
    public void takeAction(int returnResult) {
        if (returnResult == 0) {
            Toast.makeText(FirstActivity.this, "number inserted", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(FirstActivity.this, "not insert", Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.showbtn)
    public void onViewClicked() {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
