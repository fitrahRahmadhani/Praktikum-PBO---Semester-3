package fitrahRahmadhani.relasiclass.percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    // constructor default
    Mobil(){    }
    
    // Setter Getter
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    public String getMerk(){
        return merk;
    }
    public int getBiaya(){
        return biaya;
    }
    
    // method
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
