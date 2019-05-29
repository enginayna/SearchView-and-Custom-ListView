package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<FruitData> array = new ArrayList<>();
    Context context;
    LayoutInflater inflater;
    FruitData fruitData;


    public CustomAdapter(List<FruitData> array, Context context) {
        this.array = array;
        this.context = context;
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.gridviewspecialdesign,null);
        ImageView img = view.findViewById(R.id.img);
        TextView tv = view.findViewById(R.id.tv);
        fruitData = array.get(position);
        tv.setText(fruitData.getName());
        if (fruitData.getName().equals("Apple")){
            img.setImageResource(R.drawable.apple);
        }
        if (fruitData.getName().equals("Apricot")){
            img.setImageResource(R.drawable.apricot);
        }
        if (fruitData.getName().equals("Banana")){
            img.setImageResource(R.drawable.banana);
        }
        if (fruitData.getName().equals("Cherry")){
            img.setImageResource(R.drawable.cherry);
        }
        if (fruitData.getName().equals("Fig")){
            img.setImageResource(R.drawable.fig);
        }
        if (fruitData.getName().equals("Kiwi")){
            img.setImageResource(R.drawable.kiwi);
        }
        if (fruitData.getName().equals("Lemon")){
            img.setImageResource(R.drawable.lemon);
        }
        if (fruitData.getName().equals("Orange")){
            img.setImageResource(R.drawable.orange);
        }
        if (fruitData.getName().equals("Melon")){
            img.setImageResource(R.drawable.melon);
        }
        if (fruitData.getName().equals("Watermelon")){
            img.setImageResource(R.drawable.watermelon);
        }
        if (fruitData.getName().equals("Pear")){
            img.setImageResource(R.drawable.pear);
        }
        if (fruitData.getName().equals("Peach")){
            img.setImageResource(R.drawable.peach);
        }
        if (fruitData.getName().equals("Grape")){
            img.setImageResource(R.drawable.grape);
        }
        if (fruitData.getName().equals("Strawberry")){
            img.setImageResource(R.drawable.strawberry);
        }
        if (fruitData.getName().equals("Quince")){
            img.setImageResource(R.drawable.quince);
        }
        if (fruitData.getName().equals("Plum")){
            img.setImageResource(R.drawable.plum);
        }

        return view;
    }
}
