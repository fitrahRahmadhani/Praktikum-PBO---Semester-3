package com.Barang;

public class Barang {
    public String namaBrg, jenisBrg;
    public int stok;

    public void tampilkanBarang(){
        System.out.println("Nama Barang     : " + namaBrg);
        System.out.println("Jenis Barang    : " + jenisBrg);
        System.out.println("Stok            : " + stok);
    }

    public int tambahStock(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
