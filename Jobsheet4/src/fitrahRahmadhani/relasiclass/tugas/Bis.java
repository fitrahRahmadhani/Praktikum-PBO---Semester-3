package fitrahRahmadhani.relasiclass.tugas;

public class Bis extends Kendaraan{
    Bis(String namaTrasportasi, int biaya) {
        super(namaTrasportasi);
        this.biaya = biaya;
    }
    public int getBiaya(int jarak){
        return biaya * jarak;
    }
}
