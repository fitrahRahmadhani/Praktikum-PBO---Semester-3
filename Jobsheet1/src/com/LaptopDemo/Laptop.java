package com.LaptopDemo;

public class Laptop {
    private String merk, prosesor, vga;
    private int ram, penyimpanan, ukuran;

    Laptop(String merk, int ram, String prosesor, int penyimpanan, String vga, int ukuran){
        this.merk = merk;
        this.ram = ram;
        this.prosesor = prosesor;
        this.penyimpanan = penyimpanan;
        this.vga = vga;
        this.ukuran = ukuran;
    }
    public void setVga(String vga){
        this.vga = vga;
    }
    public void setUkuran(int ukuran){
        this.ukuran = ukuran;
    }
    public String getVga(){
        return vga;
    }
    public int getUkuran(){
        return ukuran;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setprosesor(String prosesor){
        this.prosesor = prosesor;
    }
    public void setPenyimpanan(int penyimpanan){
        this.penyimpanan = penyimpanan;
    }
    public String getMerk(){
        return merk;
    }
    public int getRam(){
        return ram;
    }
    public String getprosesor(){
        return prosesor;
    }
    public int getPenyimpanan(){
        return penyimpanan;
    }
    public void tampilkanSpesifikasi(){
        System.out.println("Merk Laptop: " + merk);
        System.out.println("ram: " + ram + "GB");
        System.out.println("prosesor: " + prosesor);
        System.out.println("Kapasitas penyimpanan: " + penyimpanan + "GB");
    }
}
