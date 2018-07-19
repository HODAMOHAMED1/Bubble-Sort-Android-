package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.data_access_layer;

import android.util.Log;

import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.pojos.DataList;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.view.ApiHome_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.view.HomeInteractor_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.view.HomePresenter_Interface;


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
    public void getAllNumbers() {
        mApi.getAllNumbers();
    }

    @Override
    public void setSortedNumbers(DataList data) {
        presenter.setSortedNumbers(data);

    }


}
