package com.example.android.muhammadrinadhiputra_1202152162_modul2;

/**
 * Created by rinadhiputra on 18/02/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        Intent i = getIntent();
        //ambil nilai dari tiap value
        int foto = i.getExtras().getInt("foto");
        String jenis = i.getStringExtra("jenis");
        String nominal = i.getStringExtra("nominal");
        int komposisis = i.getExtras().getInt("komposisi");
        //ambil nilai dari id textview dan imageview
        ImageView fotoDetail = (ImageView) findViewById(R.id.detailFoto);
        TextView jenisMenu = (TextView) findViewById(R.id.jenisMenu);
        TextView nominalMenu = (TextView) findViewById(R.id.nominalHarga);
        TextView komposisi = (TextView) findViewById(R.id.komposisi);

        //nampilkan hasil get
        fotoDetail.setImageResource(foto);
        jenisMenu.setText(jenis);
        nominalMenu.setText(nominal);
        komposisi.setText(komposisis);
    }
}

