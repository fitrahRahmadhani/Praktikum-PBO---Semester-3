package fitrahRahmadhani.tugas;

public class Gorilla extends Binatang implements IHerbivora, IKarnivora{
    private String suara;
    private String warnaBulu;
    Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayBinatang(){
        System.out.println("Jenis: Karnivora + Herbivora");
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan: Daging + Tumbuhan");
    }
    public void displayData(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah kaki: " + this.jmlKaki);
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
    }
}
