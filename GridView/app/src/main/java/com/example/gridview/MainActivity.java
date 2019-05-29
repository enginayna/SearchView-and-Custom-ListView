package com.example.gridview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private GridView gView;
ArrayList<FruitData> list = new ArrayList<>();
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gView = findViewById(R.id.gView);


        list.add( new FruitData("Apple"));
        list.add( new FruitData("Apricot"));
        list.add( new FruitData("Banana"));
        list.add( new FruitData("Cherry"));
        list.add( new FruitData("Quince"));
        list.add( new FruitData("Strawberry"));
        list.add( new FruitData("Melon"));
        list.add( new FruitData("Watermelon"));
        list.add( new FruitData("Pear"));
        list.add( new FruitData("Kiwi"));
        list.add( new FruitData("Orange"));
        list.add( new FruitData("Lemon"));
        list.add( new FruitData("Peach"));
        list.add( new FruitData("Grape"));
        list.add( new FruitData("Plum"));
        list.add( new FruitData("Fig"));

        CustomAdapter customAdapter = new CustomAdapter(list,context);
        gView.setAdapter(customAdapter);


    }
}
