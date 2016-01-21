package com.example.stephen.doggydogworld;

import android.util.Log;

/**
 * Created by gamee on 1/7/2016.
 */
public class Dog {
    private String name;
    private int age;
    private int legs = 4;
    private String breed;
    private String gender;


    void Dogs(String dName, String dBreed, String dGender, String heOrShe) {
        name = dName;
        breed = dBreed;
        gender = dGender;

        Log.d("MainActive", "My new puppy's name is " + dName + ". " + heOrShe + " is a " + dBreed + " and is my little " + dGender + "!");


    }


    void bork() {
        String bark = name + " Just barked!!";
        Log.d("MainActive", bark);

    }

    void attack(String victim) {
        String att = name + " has attacked " + victim + "!!!";
        Log.d("MainActive", "O noes!! " + att);


    }

    void sorry(String reciver, String reciever2) {
        String so = name + " is very sorry for attacking " + reciver + " but is not sorry for attacking " + reciever2;
        Log.d("MainActive", so);
    }


}
