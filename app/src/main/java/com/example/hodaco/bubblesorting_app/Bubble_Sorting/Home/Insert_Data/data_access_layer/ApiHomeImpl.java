package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.data_access_layer;

import android.util.Log;


import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.pojos.Data;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.pojos.ResponseMessage;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.retrofit_control.ApiUtils;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.retrofit_control.Service;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view.ApiHome_Interface;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view.HomeInteractor_Interface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hoda.CO on 18/07/2018.
 */

public class ApiHomeImpl implements ApiHome_Interface {
    HomeInteractor_Interface interactor;
    int returnValue=-1;
    public ApiHomeImpl(HomeInteractor_Interface interactor) {
        this.interactor = interactor;
    }

    @Override
    public void insertNumber(Data num) {
      Service service = ApiUtils.sortData();
      service.insertNumber(num).enqueue(new Callback<ResponseMessage>() {
          @Override
          public void onResponse(Call<ResponseMessage> call, Response<ResponseMessage> response) {
              if (response.isSuccessful()) {
                  ResponseMessage responseReturn = response.body();
                  Log.i("success",responseReturn.getMessage().toString());
                  if(responseReturn.getMessage().toString().equals("review added"))
                  {
                      returnValue=0;
                  }
                  else{
                      returnValue=1;
                  }
                  resetResult();
              }
          }

          @Override
          public void onFailure(Call<ResponseMessage> call, Throwable t) {
              Log.i("result",t.getMessage());
              returnValue=1;
              resetResult();
          }
      });

    }
    @Override
    public void resetResult() {
        interactor.returnResultFromInteractor(returnValue);
    }

}
