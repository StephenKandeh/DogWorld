package com.example.stephen.doggydogworld;

import android.util.Log;

/**
 * Created by gamee on 1/7/2016.
 */
public class Dog {
    String  name;
    int age;
    int legs = 4;
    String breed;
    void bork() {
        String bark = name + " Just barked!!";
        Log.d("MainActive", bark);

    }


}
