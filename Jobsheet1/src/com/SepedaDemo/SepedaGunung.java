/*Nama: Fitrah Rahmadhani Ahmad
  NIM: 2141762092
  No.Absen: 07
  Kelas: SIB-2E 
 */
package com.SepedaDemo;

public class SepedaGunung extends Sepeda {
    private String tipeSuspensi;

    public void setTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }

    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }
}
