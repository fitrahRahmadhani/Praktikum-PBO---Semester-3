package fitrahRahmadhani.tugas1;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total sudut segitiga dengan sisi A sebesar 90 derajat adalah : " + segitiga.totalSudut(90));

        System.out.println("Total sudut segitiga dengan sisi A 90 derajat dan sisi B 30 derajat adalah : " + segitiga.totalSudut(90, 30));

        System.out.println("Keliling segitiga dengan sisi berurutan sebesar 5cm, 4cm, dan 3cm adalah : " + segitiga.keliling(5, 4, 3));

        System.out.println("Sisi miring segitiga dengan tinggi 8cm dan lebar 6cm : " + segitiga.keliling(8,6));
    }
}
