package com.MouseDemo;

public class Mouse {
    private String merk, warna, sensor;
    private int berat, jumlahTombol;

    Mouse(String merk, String warna, String sensor, int berat, int jumlahTombol){
        this.merk = merk;
        this.warna = warna;
        this.sensor = sensor;
        this.berat = berat;
        this.jumlahTombol = jumlahTombol;
    }
    public void setBerat(int berat){
        this.berat = berat;
    }
    public void setJumlahTombol(int jumlahTombol){
        this.jumlahTombol = jumlahTombol;
    }
    public int getBerat(){
        return berat;
    }
    public int getJumlahTombol(){
        return  jumlahTombol;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public void setSensor(String sensor){
        this.sensor = sensor;
    }
    public String getMerk(){
        return merk;
    }
    public String getWarna(){
        return warna;
    }
    public String getSensor(){
        return sensor;
    }
    public void tampilkanSpesifikasi(){
        System.out.println("Merk Mouse: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Jenis sensor: " + sensor);
        System.out.println("Berat: " + berat);
        System.out.println("Jumlah tombol: " + jumlahTombol);
    }
}
