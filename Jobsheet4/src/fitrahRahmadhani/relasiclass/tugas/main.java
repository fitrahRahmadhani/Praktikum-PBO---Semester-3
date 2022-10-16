package fitrahRahmadhani.relasiclass.tugas;

public class main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("GO-JEK", 2500);
        Mobil mobil1 = new Mobil("GO-CAR", 3500);
        Bis bis1 = new Bis("Pandawa 87", 500);
        
        Orang orang1 = new Orang("Cakrawangsa", "Lowokwaru", "Blimbing", 7);
        Orang orang2 = new Orang("Waskita", "Malang", "Surabaya", 125);
        Orang orang3 = new Orang("Pandhu", "Malang", "Jakarta", 851);

        orang1.setKendaraan(motor1);
        orang1.biaya();
        orang2.setKendaraan(mobil1);
        orang2.biaya();
        orang3.setKendaraan(bis1);
        orang3.biaya();
    }
}
