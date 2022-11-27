package fitrahRahmadhani.tugas;

public class Main {
    public static void main(String[] args) {
        Keledai keledai1 = new Keledai("Donkey", 4, "Whehehehe", "Abu-abu");

        Singa singa1 = new Singa("Simba", 4, "Roarrrr", "Coklat");

        Gorilla gorilla1 = new Gorilla("Kong", 4, "Haummmm", "Hitam");

        gorilla1.displayBinatang();
        gorilla1.displayMakan();
        gorilla1.displayData();
        System.out.println();
        singa1.displayBinatang();
        singa1.displayMakan();
        singa1.displayData();
        System.out.println();
        keledai1.displayBinatang();
        keledai1.displayMakan();
        keledai1.displayData();
    }
}
