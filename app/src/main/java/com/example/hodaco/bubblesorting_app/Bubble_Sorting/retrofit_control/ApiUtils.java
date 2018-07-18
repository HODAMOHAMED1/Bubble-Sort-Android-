package com.example.hodaco.bubblesorting_app.Bubble_Sorting.retrofit_control;

/**
 * Created by hoda.CO on 09/04/2018.
 */

public class ApiUtils {
    public static final String BASE_URL =  "http://localhost:8084/BubbleSortApi/api/version1/numbers/";


    public static Service getHospitalService() {

        return RetrofitClient.getClient(BASE_URL).create(Service.class);
    }
}
