package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.data_access_layer;

import android.util.Log;


import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.pojos.DataList;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.retrofit_control.ApiUtils;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.retrofit_control.Service;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.view.ApiHome_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.view.HomeInteractor_Interface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hoda.CO on 18/07/2018.
 */

public class ApiHomeImpl implements ApiHome_Interface {
    HomeInteractor_Interface interactor;
    public ApiHomeImpl(HomeInteractor_Interface interactor) {
        this.interactor = interactor;
        Log.i("hoda","api");
    }

    @Override
    public void getAllNumbers() {
        Service service = ApiUtils.sortData();
        service.getAllNumbers().enqueue(new Callback<DataList>() {
            @Override
            public void onResponse(Call<DataList> call, Response<DataList> response) {
                Log.i("hoda",response.body().getList_numbers().toString());
                DataList data = new DataList();
                data.setList_numbers(response.body().getList_numbers());
                 interactor.setSortedNumbers(data);
            }

            @Override
            public void onFailure(Call<DataList> call, Throwable t) {

            }
        });
    }


}
