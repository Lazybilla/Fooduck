package com.example.zeeshan.fooduck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class Menu extends AppCompatActivity {


    private AHBottomNavigation mNavigation ;
    private AHBottomNavigationItem mTest1,mTest2,mTest3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        // mNavigation = (AHBottomNavigation)findViewById(R.id);



        mTest1 = new AHBottomNavigationItem("Menu",R.drawable.icons8_food_50);
        mTest2 = new AHBottomNavigationItem("Oraganic",R.drawable.icons8_fish_food_50);
        mTest3 = new AHBottomNavigationItem("Delivery",R.drawable.icons8_deliver_food_50);



        mNavigation.addItem(mTest1);
        mNavigation.addItem(mTest2);
        mNavigation.addItem(mTest3);





    }
}
