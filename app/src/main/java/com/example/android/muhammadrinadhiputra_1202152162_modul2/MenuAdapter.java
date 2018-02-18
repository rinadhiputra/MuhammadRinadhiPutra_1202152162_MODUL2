package com.example.android.muhammadrinadhiputra_1202152162_modul2;

/**
 * Created by rinadhiputra on 18/02/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> { //referensi kelas dari recycler kelas
    private LayoutInflater mInflater;
    private List<list> daftarMenu;

    public MenuAdapter(Context context, List<list> daftarMenu) {
        mInflater = LayoutInflater.from(context);
        this.daftarMenu = daftarMenu;

    }
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView jenis, nominal;
        ImageView foto;

        public MyViewHolder(View view) {
            super(view);

            jenis = (TextView) view.findViewById(R.id.jenis);
            nominal = (TextView) view.findViewById(R.id.nominal);
            foto = (ImageView) view.findViewById(R.id.foto);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            // Use that to access the affected item in mWordList.
            String element = daftarMenu.get(mPosition).toString();
            Toast.makeText(view.getContext(), jenis.getText(), Toast.LENGTH_SHORT).show();
            Intent i = new Intent(view.getContext(), DetailMenu.class);
            int foto = daftarMenu.get(mPosition).getFoto();
            int komposisi = daftarMenu.get(mPosition).getKomposisi();
            i.putExtra("foto", foto);
            i.putExtra("jenis",jenis.getText());
            i.putExtra("nominal",nominal.getText());
            i.putExtra("komposisi",komposisi);
            view.getContext().startActivity(i);

        }

        public int getLayoutPosition() {
            int layoutPosition;
            return layoutPosition;
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_list_menu, parent, false);

        return new MyViewHolder(mItemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        list list = daftarMenu.get(position);
        holder.foto.setImageResource(list.getFoto());

        holder.nominal.setText(list.getNominal());
        holder.jenis.setText(list.getJenis());


    }
    @Override
    public int getItemCount() {
        return daftarMenu.size();
    }


}

