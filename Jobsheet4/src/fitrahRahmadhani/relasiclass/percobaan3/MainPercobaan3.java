package fitrahRahmadhani.relasiclass.percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567", "Patrick Star");
        KeretaApi keratApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keratApi.info());
    }
}
