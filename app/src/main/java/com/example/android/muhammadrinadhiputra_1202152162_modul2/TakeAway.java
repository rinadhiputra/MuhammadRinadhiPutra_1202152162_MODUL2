package com.example.android.muhammadrinadhiputra_1202152162_modul2;

/**
 * Created by rinadhiputra on 18/02/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void pesantakeaway(View view) {
        Intent i = new Intent(this, DaftarMenu.class); //supaya button bisa ke klik dan pindah ke kelas daftarmenu
        startActivity(i);
    }
}
