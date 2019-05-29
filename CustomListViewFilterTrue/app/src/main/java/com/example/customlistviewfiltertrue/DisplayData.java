package com.example.customlistviewfiltertrue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DisplayData extends BaseAdapter {
   List<Cities>  data = new ArrayList<>();
    LayoutInflater inflater;
    Context context;


    public DisplayData(List<Cities> data, Context context) {
        this.data = data;
        this.context = context;

    }

    @Override
    public int getCount() {
        return data.size();
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
        View view = inflater.inflate(R.layout.cityspecialdesign,null);
        ImageView imageView = view.findViewById(R.id.img);
        TextView textView = view.findViewById(R.id.cityTv);
        Cities cities = data.get(position);
        textView.setText(cities.getName());

        for (int i =0; i<81;i++){

                imageView.setImageResource(R.drawable.indir);

        }
        return view;
    }
}
