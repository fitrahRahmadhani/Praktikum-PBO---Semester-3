/*  Nama    : Fitrah Rahmadhani Ahmad
    NIM     : 2141762092
    Kelas   : SIB - 2E
    No.Absen: 07
*/ 

package com.gajiPegawai;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Mitra Wahyudin", "3792", 10);
        Pegawai pegawai2 = new Pegawai("Cinta Mandasari", "2679", 6);
        Pegawai pegawai3 = new Pegawai("Danu Megantara", "2221", 8);
        Pegawai pegawai4 = new Pegawai("Kuncara Siraita", "5325", 7);

        pegawai1.hitungGajiHarian();
        pegawai2.hitungGajiHarian();
        pegawai3.hitungGajiHarian();
        pegawai4.hitungGajiHarian();
    }
}
