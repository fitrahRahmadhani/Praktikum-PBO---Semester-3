package fitrahRahmadhani.relasiclass.percobaan2;

public class Sopir {
    private String nama;
    private int biaya;

    // constructor default
    Sopir(){    }

    // Setter Getter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    public String getNama(){
        return nama;
    }
    public int getBiaya(){
        return biaya;
    }

    // method
    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}
