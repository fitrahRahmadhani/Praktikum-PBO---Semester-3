package com.MouseDemo;

public class MouseWireless extends Mouse{
    private String jenisKoneksi;
    MouseWireless(String merk, String warna, String sensor, int berat, int jumlahTombol, String jenisKoneksi) {
        super(merk, warna, sensor, berat, jumlahTombol);
        this.jenisKoneksi = jenisKoneksi;
    }
    public void setJenisKoneksi(String jenisKoneksi){
        this.jenisKoneksi = jenisKoneksi;
    }
    public String getJenisKoneksi(){
        return jenisKoneksi;
    }
    public void tampilkanSpesifikasi(){
        super.tampilkanSpesifikasi();
        System.out.println("Jenis Koneksi: " + jenisKoneksi);
    }
}
