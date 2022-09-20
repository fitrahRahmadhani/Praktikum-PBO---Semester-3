package com.Tugas2;

public class Lingkaran {
    public double phi = 3.14, r, luas, keliling;

    Lingkaran(double r){
        this.r = r;
    }
    public void hitungLuas(){
        luas = phi * r * r;
        System.out.println("Luas lingkaran dengan jari = " + r + " adalah = " + luas);
    }
    public void hitungKeliling(){
        keliling = phi * r * 2;
        System.out.println("Keliling lingkaran dengan jari = " + r + " adalah = " + keliling);
    }
}
