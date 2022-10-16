package fitrahRahmadhani.relasiclass.tugas;

public class Mobil extends Kendaraan{
    Mobil(String namaTransportasi, int biaya) {
        super(namaTransportasi);
        this.biaya = biaya;
    }
    public int getBiaya(int jarak){
        return biaya * jarak;
    }
}
