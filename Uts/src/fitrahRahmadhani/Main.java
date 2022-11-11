package fitrahRahmadhani;

public class Main {
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran(7);
        L1.printKeliling();
        L1.printLuas();

        Persegi P1 = new Persegi(4);
        P1.printKeliling();
        P1.printLuas();

        Segitiga S1 = new Segitiga(20, 24);
        S1.printKeliling();
        S1.printLuas();

        LimasSegitiga LS1 = new LimasSegitiga(S1.getLuas(), 30);
        LS1.printVolume();
        LS1.printLuasPermukaan();

        System.out.println();
        LimasSegiempat LP1 = new LimasSegiempat(P1.getLuas(), 3);
        LP1.printVolume();
        LP1.printLuasPermukaan();

    }
}
