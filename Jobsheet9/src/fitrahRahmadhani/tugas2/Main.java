package fitrahRahmadhani.tugas2;

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Dosen();
        manusia.makan();
        //manusia.lembur(); jika dijalankan akan error karena class manusia tidak ada method lembur

        manusia = new Mahasiswa();
        manusia.makan();
        // manusia.tidur(); jika dijalankan akan error karena class manusia tidak ada method makan
    }
}
