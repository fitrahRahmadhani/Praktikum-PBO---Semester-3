package fitrahRahmadhani.percobaan1;

public class Mahasiswa{
    protected String nama;
    protected ICumlaude iCumlaude;
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus");
    }
}
