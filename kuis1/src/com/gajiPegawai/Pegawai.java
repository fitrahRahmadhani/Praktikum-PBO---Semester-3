/*  Nama    : Fitrah Rahmadhani Ahmad
    NIM     : 2141762092
    Kelas   : SIB - 2E
    No.Absen: 07
*/ 
package com.gajiPegawai;

public class Pegawai {
    private String Nama, NIP;
    private double gajiPokok, lembur, uangMakan, transport, total;
    private int jumlahJamKerja;

    Pegawai(String Nama, String NIP, int jumlahJamKerja){
        this.Nama = Nama;
        this.NIP = NIP;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    // Setter
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    public void setLembur(double lembur){
        this.lembur = lembur;
    }
    public void setUangMakan(double uangMakan){
        this.uangMakan = uangMakan;
    }
    public void setTransport(double transport){
        this.transport = transport;
    }
    public void setJamKerja(int JumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }

    // Getter
    public String getNama(){
        return Nama;
    }
    public String getNIP(){
        return NIP;
    }
    public double getGajiPokok(){
        return gajiPokok;
    }
    public double getLembur(){
        return lembur;
    }
    public double getUangMakan(){
        return uangMakan;
    }
    public double getTransport(){
        return transport;
    }
    public int getJamKerja(){
        return jumlahJamKerja;
    }

    public void hitungGajiHarian(){
        double indexGajiPokok = 2000;
        if(jumlahJamKerja >= 9 && jumlahJamKerja <= 24){
            gajiPokok = 7 * indexGajiPokok;
            lembur = (jumlahJamKerja - 7) * (1.5 * 2000);
            uangMakan = 3500;
            transport = 4000;
            total = gajiPokok + lembur + uangMakan + transport;
            cetakPenghasilan();
        }else if(jumlahJamKerja > 7 && jumlahJamKerja <= 24){ //sudah pasti masuk kategori 8 jam, 
            gajiPokok = 7 * indexGajiPokok; //karena tidak mungkin ada nilai desiman (variabel jumlahJamKerja = integer)
            lembur = (jumlahJamKerja - 7) * (1.5 * 2000);
            uangMakan = 3500;
            transport = 0;
            total = gajiPokok + lembur + uangMakan + transport;
            cetakPenghasilan();
        }else if(jumlahJamKerja >= 0 && jumlahJamKerja <= 7){
            gajiPokok = jumlahJamKerja * indexGajiPokok;
            lembur = 0;
            uangMakan = 0;
            transport = 0;
            total = gajiPokok + lembur + uangMakan + transport;
            cetakPenghasilan();
        }else{
            System.out.println("Kesalahan Input Data");
        }
    }
    public void cetakPenghasilan(){
        System.out.println("\nNama pegawai            : " + Nama);
        System.out.println("NIP                     : " + NIP);
        System.out.println("Jam kerja               : " + jumlahJamKerja);
        System.out.println("Gaji pokok @Rp2000      : Rp" + gajiPokok);
        System.out.println("Bonus uang lembur       : Rp" + lembur);
        System.out.println("Bonus uang makan        : Rp" + uangMakan);
        System.out.println("Bunus transport lembur  : Rp" + transport);
        System.out.println("TOTAL GAJI DITERIMA     : Rp" + total);
    }
}
