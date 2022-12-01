package fitrahRahmadhani;

public class Main {
    public static void main(String[] args) {
        Pemburu homoWajakensis = new Pemburu("Homo Wajakensis");
        AnakPemburu homoWajakensisChild = new AnakPemburu("Homo Wajakensis Cilik");

        Pemburu pithecanthropus = new Pemburu("Pithecanthropus");
        AnakPemburu pithecanthropusChild = new AnakPemburu("Pithecanthropus Cilik");

        TyrannosaurusRex trex1 = new TyrannosaurusRex("Achaia", "bekas luka di ekor");
        TyrannosaurusRex trex2 = new TyrannosaurusRex("Mesogus", "bekas luka di wajah kiri");
        Triceratops tritop1 = new Triceratops("Dacia", "tanduk kiri patah");
        Oviraptor oviraptor1 = new Oviraptor("Achaia", "ekor lebih pendek");
        Oviraptor oviraptor2 = new Oviraptor("Mesogus", "warna lebih gelap");

        System.out.println("--- INFORMASI DINOSAURUS ---");
        trex1.berjalan();
        trex1.makan();
        System.out.println("-----------------------------");
        tritop1.berjalan();
        tritop1.makan();
        System.out.println("-----------------------------");
        oviraptor1.berjalan();
        oviraptor1.makan();
        oviraptor1.bertelur();
        System.out.println("-----------------------------");

        System.out.println("\n--- DAFTAR TARGET BURUAN ---");
        trex1.printInformasi();
        trex2.printInformasi();
        tritop1.printInformasi();
        oviraptor1.printInformasi();

        System.out.println();
        homoWajakensis.berburu(trex1);
        homoWajakensisChild.berburu(trex1);
        homoWajakensisChild.mengambilTelur(oviraptor1);

        System.out.println();
        pithecanthropus.berburu(trex2);
        pithecanthropusChild.berburu(trex2);
        pithecanthropusChild.mengambilTelur(oviraptor2);
    }
}
