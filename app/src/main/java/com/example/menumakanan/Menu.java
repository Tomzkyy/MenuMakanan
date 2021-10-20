package com.example.menumakanan;

public class Menu {
    private String nama, deskripsi, harga;
    private Integer id_gambar;

    public Menu(String nama, String deskripsi, String harga, Integer id_gambar) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.id_gambar = id_gambar;
    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getDeskripsi() {

        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {

        this.deskripsi = deskripsi;
    }

    public String getHarga() {

        return harga;
    }

    public void setHarga(String harga) {

        this.harga = harga;
    }

    public Integer getId_gambar() {

        return id_gambar;
    }

    public void setId_gambar(Integer id_gambar) {

        this.id_gambar = id_gambar;
    }
}
