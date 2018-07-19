package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.retrofit_control;

/**
 * Created by hoda.CO on 09/04/2018.
 */

public class ApiUtils {
    public static final String BASE_URL =  "http://192.168.1.3:8084/BubbleSortApi/api/version1/numbers/";


    public static Service sortData() {

        return RetrofitClient.getClient(BASE_URL).create(Service.class);
    }
}
