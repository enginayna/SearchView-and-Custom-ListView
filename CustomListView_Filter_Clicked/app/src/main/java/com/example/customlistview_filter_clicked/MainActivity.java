package com.example.customlistview_filter_clicked;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{
private ListView lv;
String[] array = new String[]{"Apple","Banane","Cherry","Watermelon","Peach","Melon","Lemon","Orange","Grape","Fig","Apricot","Strawberry","Pear","Plum","Quince"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,array);
        lv.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.searchview, menu);
       MenuItem item= menu.findItem(R.id.search);
       SearchView searchView= (SearchView) item.getActionView();
       searchView.setOnQueryTextListener(this);

        return true;
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i<array.length;i++){
            String name =array[i];
            if (name.toUpperCase().contains(newText.toUpperCase())){
                list.add(array[i]);
            }
        }
        if (list != null && list.size()>0 ){
            ArrayAdapter<String> tempAdapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,list);
            lv.setAdapter(tempAdapter);
        }

        return true;
    }
}
