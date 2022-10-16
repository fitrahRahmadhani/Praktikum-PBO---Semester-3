package fitrahRahmadhani.relasiclass.tugas;

public class Kendaraan {
    public String namaTransportasi;
    public int biaya;

    Kendaraan(String namaTransportasi){
        this.namaTransportasi = namaTransportasi;
    }
    public String getNamaTransportasi(){
        return namaTransportasi;
    }
    public int getBiaya(int jarak){
        return biaya * jarak;
    }
}
