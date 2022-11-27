package fitrahRahmadhani.tugas;

public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;
    Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayBinatang(){
        System.out.println("Jenis: Herbivora");
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan: Tumbuhan");
    }
    public void displayData(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah kaki: " + this.jmlKaki);
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
    }
}
