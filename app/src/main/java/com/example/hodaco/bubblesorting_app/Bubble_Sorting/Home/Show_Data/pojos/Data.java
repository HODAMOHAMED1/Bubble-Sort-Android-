package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Show_Data.pojos;

import java.io.Serializable;

/**
 * Created by hoda.CO on 17/07/2018.
 */

public class Data implements Serializable {
    int id;
    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
