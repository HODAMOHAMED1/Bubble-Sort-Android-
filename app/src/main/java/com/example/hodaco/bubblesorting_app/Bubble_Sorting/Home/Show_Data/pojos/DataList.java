package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.pojos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by hoda.CO on 17/07/2018.
 */

public class DataList implements Serializable {
    ArrayList<Data> list_numbers;

    public ArrayList<Data> getList_numbers() {
        return list_numbers;
    }

    public void setList_numbers(ArrayList<Data> list_numbers) {
        this.list_numbers = list_numbers;
    }
}
