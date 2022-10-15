package fitrahRahmadhani.tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(5);

        Dosen dosen1 = new Dosen("09000874", "Rahayu Purwanti", "Dk. K.H. Wahid Hasyim (Kopo) No. 26, Tidore");
        dosen1.jumlahSKS = 12;

        Dosen dosen2 = new Dosen("22212491", "Ida Puspita", "Gg. Baabur Royan No. 793, Bima");
        dosen2.jumlahSKS = 14;

        Dosen dosen3 = new Dosen("47163845", "Bagiya Hardiansyah", "Kpg. Rajawali No. 567, Madiun");
        dosen3.jumlahSKS = 16;
        
        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);
        daftar.addPegawai(dosen3);
        daftar.printPegawai();
    }
}
