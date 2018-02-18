package com.example.android.muhammadrinadhiputra_1202152162_modul2;

/**
 * Created by rinadhiputra on 18/02/2018.
 */

class list {
    private int foto, komposisi;
    private String jenis, nominal;
    public list(int foto, String jenis, String nominal, int komposisi) {
        this.foto = foto;
        this.jenis = jenis;
        this.nominal = nominal;
        this.komposisi = komposisi;
    }

    public String getNominal() {
        return nominal;
    }

    public String getJenis() {
        return jenis;
    }

    public int getFoto() {
        return foto;
    }
    public int getKomposisi() {
        return komposisi;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
