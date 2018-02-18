package com.example.android.muhammadrinadhiputra_1202152162_modul2;

/**
 * Created by rinadhiputra on 18/02/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarMenu extends AppCompatActivity {
    private List<list> daftarMenu = new ArrayList<>();  //buat list array, diambil dari kelas list
    private recyclerView recyclerView; //buat recycler view
    private MenuAdapter mAdapter; //buat adapter, penghubung , menu dan list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        recyclerView = (recyclerView) findViewById(R.id.recycler_view); //ngambil layout recycler view

        mAdapter = new MenuAdapter(this, daftarMenu);
        recyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        list list = new list(R.drawable.ChickenTeriyaki, "Chicken Teriyaki", "Rp. 30.000", R.string.ciken);
        daftarMenu.add(list);
        list = new list(R.drawable.BeefSpicy, "Beef Spicy", "Rp. 33.000", R.string.besp);
        daftarMenu.add(list);
        list = new list(R.drawable.ChickenBimbimbap, "Chicken Bimbimbap", "Rp. 45.000", R.string.cbim);
        daftarMenu.add(list);
        list = new list(R.drawable.Toppoki, "Toppoki", "Rp. 35.000", R.string.toppoki);
        daftarMenu.add(list);
        list = new list(R.drawable.beefbulgogi, "Beef Bulgogi", "Rp. 50.000", R.string.bebu);
        daftarMenu.add(list);
        list = new list(R.drawable.BimbimbapRice, "Bimbimbap Rice", "Rp. 40.000", R.string.bimric);
        daftarMenu.add(list);

    }

    }
}
