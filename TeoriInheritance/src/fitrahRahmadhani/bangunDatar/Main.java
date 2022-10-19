package fitrahRahmadhani.bangunDatar;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();

        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 7;
        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println();

        lingkaran.r = 21;
        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();
        
        segitiga.alas = 30;
        segitiga.tinggi = 15;
        segitiga.luas();
    }
}
