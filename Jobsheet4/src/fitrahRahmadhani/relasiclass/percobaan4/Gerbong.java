package fitrahRahmadhani.relasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    // constructor
    Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    // Setter Getter
    public void setKode(String kode){
        this.kode = kode;
    }
    public void setPenumpang(Penumpang penumpang, int nomor){
        if( this.arrayKursi[nomor - 1].getPenumpang() == null){
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }else{
            System.out.println("\nDear Sdr." + penumpang.getNama());
            System.out.println("Kursi No." + nomor + " sudah terisi penumpang");
            System.out.println("Silahkan cari kursi lain\n");
        }
    }
    public String getKode(){
        return kode;
    }
    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }

    // method
    public String info(){
        String info = "";
        info += "Kode: " + kode + "\n";
        for(Kursi kursi : arrayKursi){
            info += kursi.info();
        }
        return info;
    }
}
