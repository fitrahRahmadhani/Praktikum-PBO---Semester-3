package com.ChargerDemo;

public class ChargerFast extends Charger {
    private String teknologiFastCharging;
    ChargerFast(String merk, String warna, int kapasitasDaya, String teknologiFastCharging, String jenisPort, int panjangKabel) {
        super(merk, warna, kapasitasDaya, jenisPort, panjangKabel);
        this.teknologiFastCharging = teknologiFastCharging;
    }
    public void setTeknologiFastCharging(String teknologiFastCharging){
        this.teknologiFastCharging = teknologiFastCharging;
    }
    public String getTeknologiFastCharging(){
        return teknologiFastCharging;
    }
    public void tampilkanSpesifikasi(){
        super.tampilkanSpesifikasi();
        System.out.println("Teknologi Fast Charging: " + teknologiFastCharging);
    }
}
