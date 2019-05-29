package com.example.customlistviewfiltertrue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
     private ListView cityLv;
    ArrayList<Cities> cities = new ArrayList<>();
    DisplayData displayData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityLv=findViewById(R.id.cityLv);

        String[] iller =new String[82];
        iller[0]="";
        iller[1]="Adana";iller[2]="Adıyaman";iller[3]="Afyon";iller[4]="Ağrı";iller[5]="Amasya";iller[6]="Ankara";iller[7]="Antalya";iller[8]="Artvin";iller[9]="Aydın";
        iller[10]="Balıkesir";iller[11]="Bilecik";iller[12]="Bingöl";iller[13]="Bitlis";iller[14]="Bolu";iller[15]="Burdur";iller[16]="Bursa";iller[17]="Çanakkale";
        iller[18]="Çankırı";iller[19]="Çorum";iller[20]="Denizli";iller[21]="Diyarbakır";iller[22]="Edirne";iller[23]="Elazığ";iller[24]="Erzincan";iller[25]="Erzurum";
        iller[26]="Eskişehir";iller[27]="Gaziantep";iller[28]="Giresun";iller[29]="Gümüşhane";iller[30]="Hakkari";iller[31]="Hatay";iller[32]="Isparta";iller[33]="Içel";
        iller[34]="Izmir";iller[35]="Istanbul";iller[36]="Kars";iller[37]="Kastamonu";iller[38]="Kayseri";iller[39]="Kırklareli";iller[40]="Kırşehir";iller[41]="Kocaeli";
        iller[42]="Konya";iller[43]="Kütahya";iller[44]="Malatya";iller[45]="Manisa";iller[46]="Kahramanmaraş";iller[47]="Mardin";iller[48]="Muğla";iller[49]="Muş";
        iller[50]="Nevşehir";iller[51]="Niğde";iller[52]="Ordu";iller[53]="Rize";iller[54]="Sakarya";iller[55]="Samsun";iller[56]="Siirt";iller[57]="Sinop";
        iller[58]="Sivas";iller[59]="Tekirdağ";iller[60]="Tokat";iller[61]="Trabzon";iller[62]="Tunceli";iller[63]="Şanlıurfa";iller[64]="Uşak";iller[65]="Van";
        iller[66]="Yozgat";iller[67]="Zonguldak";iller[68]="Aksaray";iller[69]="Bayburt";iller[70]="Karaman";iller[71]="Kırıkkale";iller[72]="Batman";iller[73]="Şırnak";
        iller[74]="Bartın";iller[75]="Ardahan";iller[76]="Iğdır";iller[77]="Yalova";iller[78]="Karabük";iller[79]="Kilis";iller[80]="Osmaniye";iller[81]="Düzce";


        for (int i =0; i<iller.length;i++){
            if (i == 0){
            }
            else{
                cities.add(new Cities(iller[i]));
            }
        }
        displayData = new DisplayData(cities,MainActivity.this);
        cityLv.setAdapter(displayData);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search,menu);
        MenuItem item=menu.findItem(R.id.action_search);
        SearchView searchView=(SearchView) item.getActionView();
        searchView.setOnQueryTextListener(this);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        ArrayList<Cities> tempCity = new ArrayList<>();
        for (int i =0; i<cities.size();i++){
                Cities c = cities.get(i);
            if (c.getName().toUpperCase().contains(newText.toUpperCase())){
                tempCity.add(c);
            }
        }
        if (tempCity != null && tempCity.size() > 0){
            displayData = new DisplayData(tempCity,MainActivity.this);
            cityLv.setAdapter(displayData);
        }

        return true;
    }
}
