package com.Tugas1;

public class Peminjaman {
    public String id, namaMember, namaGame;
    public int harga, lamaSewa, bayar;

    Peminjaman(String id, String namaMember, String namaGame, int harga, int lamaSewa){
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.harga = harga;
        this.lamaSewa = lamaSewa;
    }
    public void tampilkanDataTransaksi(){
        System.out.println("\nId peminjaman    : " + id);
        System.out.println("Nama             : " + namaMember);
        System.out.println("Game             : " + namaGame);
        System.out.println("Harga sewa @1day : " + harga);
        System.out.println("Lama sewa        : " + lamaSewa);
        hitung();
    }
    public void hitung(){
        bayar = lamaSewa * harga;
        System.out.println("TOTAL BAYAR      : " + bayar);
    }
}
