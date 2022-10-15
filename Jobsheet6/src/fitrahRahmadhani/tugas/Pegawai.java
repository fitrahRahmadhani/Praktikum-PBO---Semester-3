package fitrahRahmadhani.tugas;

public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public int getGaji(){
        // deklarasi indeks gaji tiap 1 SKS
        return 400000;
    }
}
