package com.SetrikaDemo;

public class Setrika {
    private String merk, warna;
    private int berat, daya;

    Setrika(String merk, String warna, int berat, int daya){
        this.merk = merk;
        this.warna = warna;
        this.berat = berat;
        this.daya = daya;
    }
    public void setBerat(int berat){
        this.berat = berat;
    }
    public void setDaya(int daya){
        this.daya= daya;
    }
    public int getBerat(){
        return berat;
    }
    public int getDaya(){
        return  daya;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getMerk(){
        return merk;
    }
    public String getWarna(){
        return warna;
    }
    public void tampilkanSpesifikasi(){
        System.out.println("Merk Setrika: " + merk);
        System.out.println("Warna: " + warna);
    }
}
