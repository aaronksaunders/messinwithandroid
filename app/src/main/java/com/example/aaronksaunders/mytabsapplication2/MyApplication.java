package com.example.aaronksaunders.mytabsapplication2;

import android.app.Application;

/**
 * Created by aaronksaunders on 9/29/14.
 */
public class MyApplication extends Application {
    private String test = "global string variable";


    public String getTest() {
        return  test;
    }

    public void setTest(String test) {
        this.test = test;
    }

}
