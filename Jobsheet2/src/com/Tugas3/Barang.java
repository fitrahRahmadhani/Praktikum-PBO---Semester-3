package com.Tugas3;

public class Barang {
    private String kode, namaBarang;
    private int hargaDasar;
    private float diskon, hargaJual;
    
    Barang(String kode, String namaBarang, int hargaDasar, float diskon){
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon/100;
    }
    public int hitungHargaJual(){
        hargaJual = (hargaDasar - (diskon * hargaDasar));
        return (int) hargaJual;
    }
    public void tampilkanData(){
        System.out.println("Kode barang     : " + kode);
        System.out.println("Nama barang     : " + namaBarang);
        System.out.println("Harga dasar     : Rp" + hargaDasar);
        System.out.println("Diskon          : " + diskon * 100 +"%");
        System.out.println("Harga jual      : Rp" + hitungHargaJual());
    }
}
