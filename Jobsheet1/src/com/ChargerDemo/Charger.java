package com.ChargerDemo;

public class Charger {
    private String merk, warna, jenisPort;
    private int kapasitasDaya, panjangKabel;

    Charger(String merk, String warna, int kapasitasDaya, String jenisPort, int panjangKabel){
        this.merk = merk;
        this.warna = warna;
        this.kapasitasDaya = kapasitasDaya;
        this.jenisPort = jenisPort;
        this.panjangKabel = panjangKabel;
    }
    public void setJenisPort(String jenisPort){
        this.jenisPort = jenisPort;
    }
    public void setPanjangKabel(int panjangKabel){
        this.panjangKabel = panjangKabel;
    }
    public String getJenisPost(){
        return jenisPort;
    }
    public int getPanjangKabel(){
        return panjangKabel;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public void setkapasitasDaya(int kapasitasDaya){
        this.kapasitasDaya = kapasitasDaya;
    }
    public String getMerk(){
        return merk;
    }
    public String getWarna(){
        return warna;
    }
    public int getkapasitasDaya(){
        return kapasitasDaya;
    }
    public void tampilkanSpesifikasi(){
        System.out.println("Merk Charger: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Jenis kapasitasDaya: " + kapasitasDaya);
    }
}
