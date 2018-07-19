package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.presenter;

import android.util.Log;

import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.data_access_layer.Interactor;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.pojos.Data;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view.HomeInteractor_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view.HomePresenter_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view.HomeView_Interface;

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
    public void insertNumber(Data num) {
        interactor.insertNumber(num);

    }

    @Override
    public void returnResultFromInteractor(int result) {
        view.takeAction(result);
    }
}
