package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.retrofit_control;






import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.pojos.DataList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;


/**
 * Created by hoda.CO on 09/04/2018.
 */

public interface Service {
    @GET("retrieve")
    @Headers("Content-Type:application/json")
    Call<DataList> getAllNumbers();
}
