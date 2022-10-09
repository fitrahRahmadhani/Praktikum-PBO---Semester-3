package fitrahRahmadhani.relasiclass.percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    // constructor
    KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    // Setter Getter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void setMasinis(Pegawai masinis){
        this.masinis = masinis;
    }
    public void setAsisten(Pegawai asisten){
        this.asisten = asisten;
    }
    public String getNama(){
        return nama;
    }
    public String getKelas(){
        return kelas;
    }
    public Pegawai getMasinis(){
        return masinis;
    }
    public Pegawai getAsisten(){
        return asisten;
    }

    // method
    public String info(){
        if(this.asisten != null){
            String info = "";
            info += "Nama: " + this.nama + "\n";
            info += "Kelas: " + this.kelas + "\n";
            info += "Masinis: " + this.masinis.info() + "\n";
            info += "Asisten: " + this.asisten.info() + "\n";
            return info;
        }else{
            String info = "";
            info += "Nama: " + this.nama + "\n";
            info += "Kelas: " + this.kelas + "\n";
            info += "Masinis: " + this.masinis.info() + "\n";
            info += "Asisten Kosong! " + "\n";
            return info;
        }
    }
}
