package com.example.android.muhammadrinadhiputra_1202152162_modul2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static com.example.android.muhammadrinadhiputra_1202152162_modul2.R.id.Spinner;

/**
 * Created by rinadhiputra on 18/02/2018.
 */

public class DineIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int variabel;
    String nomeja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        showSpinner(); //nampilin menu drop down
    }

    private void showSpinner() {
        // Create the spinner.
        Spinner spinner = (Spinner) findViewById(Spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        // Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.meja, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        this.nomeja = adapterView.getItemAtPosition(i).toString(); //nempatin nilai dari spinner
        String showToast = this.nomeja + " telah terpilih"; // buat variabel untuk nampilin toast
        this.variabel = i;
        if (i != 0) { // nampilin toast
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, showToast, Toast.LENGTH_LONG);
            toast.show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void pilihPesanan(View view) {
        Context context = getApplicationContext();

        if (variabel != 0) { //pindah ke kelas Daftar_menu
            Intent i = new Intent(this, DaftarMenu.class);
            startActivity(i);
        } else { //muncul toast jika tidak pilih nomor meja
            Toast toast = Toast.makeText(context, "Silahkan Pilih Nomor Meja", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
