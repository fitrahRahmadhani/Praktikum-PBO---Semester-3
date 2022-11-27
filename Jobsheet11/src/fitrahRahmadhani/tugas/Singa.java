package fitrahRahmadhani.tugas;

public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;
    Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayBinatang(){
        System.out.println("Jenis: Karnivora");
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan: Daging");
    }
    public void displayData(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah kaki: " + this.jmlKaki);
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
    }
}
