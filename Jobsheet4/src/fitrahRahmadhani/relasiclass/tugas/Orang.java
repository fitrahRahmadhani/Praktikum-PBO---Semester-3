package fitrahRahmadhani.relasiclass.tugas;

public class Orang {
    public String nama;
    public String keberangkatan;
    public String tujuan;
    public int jarak;
    public Kendaraan kendaraan;

    Orang(String nama, String keberangkatan, String tujuan, int jarak){
        this.nama = nama;
        this.keberangkatan = keberangkatan;
        this.tujuan = tujuan;
        this.jarak = jarak;
    }
    public void biaya(){
        System.out.println(nama + " pergi dari " + keberangkatan + " ke " + tujuan + " naik " + kendaraan.getNamaTransportasi() + " dengan biaya Rp" + kendaraan.getBiaya(jarak));  
    };
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    public String getNama(){
        return nama;
    }
}
