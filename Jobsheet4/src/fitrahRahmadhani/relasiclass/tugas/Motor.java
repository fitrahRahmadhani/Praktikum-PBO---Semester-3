package fitrahRahmadhani.relasiclass.tugas;

public class Motor extends Kendaraan {
    Motor(String namaTrasportasi, int biaya) {
        super(namaTrasportasi);
        this.biaya = biaya;
    }
    public int getBiaya(int jarak){
        return biaya * jarak;
    }
}
