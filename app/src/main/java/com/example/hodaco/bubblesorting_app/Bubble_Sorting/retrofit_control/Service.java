package com.example.hodaco.bubblesorting_app.Bubble_Sorting.retrofit_control;



import com.example.hodaco.bubblesorting_app.Bubble_Sorting.pojos.Data;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.pojos.DataList;
import com.example.hodaco.bubblesorting_app.Bubble_Sorting.pojos.ResponseMessage;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;


/**
 * Created by hoda.CO on 09/04/2018.
 */

public interface Service {
    @POST("insert")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<ResponseMessage> postReview (@Body Data data);

    @GET("retrieve")
    @Headers("Content-Type:application/json")
    Call<DataList> getAllNumbers();
}
