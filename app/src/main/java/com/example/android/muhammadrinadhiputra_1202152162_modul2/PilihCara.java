package com.example.android.muhammadrinadhiputra_1202152162_modul2;

/**
 * Created by rinadhiputra on 18/02/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Context;

public class PilihCara extends AppCompatActivity {
    String pilihan; //buat variabel untuk radio button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_cara);
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, R.string.nama_nim, Toast.LENGTH_LONG); //nampilin toast saat awal run
        toast.show();

    }

    public void pilihdinein(View view) {
        this.pilihan = "Dine In";
    } //inisialisasi dari button

    public void pilihtakeaway(View view) {
        this.pilihan = "Take Away";
    }

    public void pilihmenu(View view) {
        if(this.pilihan == "Dine In"){ //jika pilih dine in
            Intent i = new Intent(this, DineIn.class); //masuk ke kelas dine in
            startActivity(i);

        }else if(this.pilihan == "Take Away"){// jika pilih take away
            Intent i = new Intent(this, TakeAway.class); //masuk ke kelas take away
            startActivity(i);
        }else{
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Silahkan Pilih Salah Satu", Toast.LENGTH_LONG); //klo gak ada pilih tampil toast
            toast.show();

        }

    }
}
