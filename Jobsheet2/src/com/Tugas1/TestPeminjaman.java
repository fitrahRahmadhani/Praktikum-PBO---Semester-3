package com.Tugas1;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pjm1 = new Peminjaman("01", "Danu Jailani", "Mortal Combat", 20000, 3);
        pjm1.tampilkanDataTransaksi();
        
        Peminjaman pjm2 = new Peminjaman("02", "Jumari Kusumo", "Assasin Creed", 20000, 7);
        pjm2.tampilkanDataTransaksi();
    }
}
