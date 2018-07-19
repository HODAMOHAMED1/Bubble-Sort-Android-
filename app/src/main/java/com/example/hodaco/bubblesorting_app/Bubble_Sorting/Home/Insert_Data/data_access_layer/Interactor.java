package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.data_access_layer;

import android.util.Log;

import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.pojos.Data;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view.ApiHome_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view.HomeInteractor_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view.HomePresenter_Interface;


/**
 * Created by hoda.CO on 18/07/2018.
 */

public class Interactor implements HomeInteractor_Interface {
    HomePresenter_Interface presenter;
    ApiHome_Interface mApi;
    public Interactor(HomePresenter_Interface pres) {
        this.presenter=pres;
        initInteractor();
    }
    void initInteractor()
    {
        mApi=new ApiHomeImpl(this);
        Log.i("hoda","interactor");
    }

    @Override
    public void insertNumber(Data num) {
        mApi.insertNumber(num);

    }

    @Override
    public void returnResultFromInteractor(int result) {
        presenter.returnResultFromInteractor(result);
    }
}
