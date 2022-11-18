package fitrahRahmadhani;

public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        Sapi sapiBrahman = new Sapi();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");
        Orang toni = new Orang("Toni");

        ani.peliharaanHewan(kucingKampung);
        budi.peliharaanHewan(lumbaLumba);
        toni.peliharaanHewan(sapiBrahman);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
        toni.ajakPeliharaanJalanJalan();
    }
}
