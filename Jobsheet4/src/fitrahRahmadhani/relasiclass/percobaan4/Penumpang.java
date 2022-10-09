package fitrahRahmadhani.relasiclass.percobaan4;

public class Penumpang {
    private String ktp;
    private String nama;

    // constructor
    Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }

    // Setter Getter
    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getKtp(){
        return ktp;
    }
    public String getNama(){
        return nama;
    }

    // method
    public String info(){
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
