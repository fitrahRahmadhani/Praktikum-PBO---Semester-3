package fitrahRahmadhani;

public class TyrannosaurusRex extends Dinosaurus{
    private String nama = "TyrannosaurusRex";
    private String lokasi;
    private String ciriCiri;

    TyrannosaurusRex(String lokasi, String ciriCiri){
        this.lokasi = lokasi;
        this.ciriCiri = ciriCiri;
    }

    public String getNama(){return this.nama;};
    public String getLokasi(){return this.lokasi;};
    public String getCiriCiri(){return this.ciriCiri;};

    @Override
    public void makan() {
        System.out.println("TyrannosaurusRex merupakan hewan karnivora, suka makan daging");
    }

    @Override
    public void berjalan() {
        System.out.println("TyrannosaurusRex berjalan menggunakan dua kaki");
    }
    
    public void printInformasi(){
        System.out.println(this.getNama());
        System.out.println("Lokasi : " + this.getLokasi());
        System.out.println("Ciri : " + this.getCiriCiri());
        System.out.println("-----------------------------");
    }
}
