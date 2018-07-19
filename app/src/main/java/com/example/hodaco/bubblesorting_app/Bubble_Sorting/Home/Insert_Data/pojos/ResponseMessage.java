package com.example.hodaco.bubblesorting_app.Bubble_Sorting.Home.Insert_Data.pojos;

import java.io.Serializable;

/**
 * Created by Aya on 30/05/2018.
 */

public class ResponseMessage implements Serializable {

    String message;

    Boolean status;

    String error;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
