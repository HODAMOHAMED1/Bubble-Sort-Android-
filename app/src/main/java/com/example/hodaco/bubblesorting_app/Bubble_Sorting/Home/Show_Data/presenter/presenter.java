package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.presenter;

import android.util.Log;

import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.data_access_layer.Interactor;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.pojos.DataList;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.view.HomeInteractor_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.view.HomePresenter_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.view.HomeView_Interface;


/**
 * Created by hoda.CO on 17/07/2018.
 */

public class presenter implements HomePresenter_Interface {
    HomeView_Interface view;
    HomeInteractor_Interface interactor;

    public presenter(HomeView_Interface mview) {
        this.view=mview;
        initPresenter();
    }
    void initPresenter()
    {
        interactor=new Interactor(this);
        Log.i("hoda","presenter");
        view.initView();
    }
    @Override
    public void getAllNumbers() {
        Log.i("hoda","presenterget");
        interactor.getAllNumbers();
    }

    @Override
    public void setSortedNumbers(DataList data) {
         view.takeAction(data);
    }


}
