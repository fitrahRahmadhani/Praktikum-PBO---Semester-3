package fitrahRahmadhani.percobaan1;
public class Rektor {

    public void beriSertifikatCumlaude(ICumlaude mahasiswa, Mahasiswa mhs){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat silahkan perkenalkan diri Anda");
        mhs.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("---------------------------------------");
    }

    public void beriSerifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        System.out.println("---------------------------------------");
    }
}
