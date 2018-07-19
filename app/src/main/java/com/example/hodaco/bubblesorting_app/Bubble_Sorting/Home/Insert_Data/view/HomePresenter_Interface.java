package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.view;


import com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.pojos.Data;

/**
 * Created by hoda.CO on 30/05/2018.
 */

public interface HomePresenter_Interface {
    public void insertNumber(Data num);
    public void returnResultFromInteractor(int result);
}
