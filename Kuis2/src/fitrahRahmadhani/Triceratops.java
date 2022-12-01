package fitrahRahmadhani;

public class Triceratops extends Dinosaurus{
    private String nama = "Triceratops";
    private String lokasi;
    private String ciriCiri;

    Triceratops(String lokasi, String ciriCiri){
        this.lokasi = lokasi;
        this.ciriCiri = ciriCiri;
    }

    public String getNama(){return this.nama;};
    public String getLokasi(){return this.lokasi;};
    public String getCiriCiri(){return this.ciriCiri;};

    @Override
    public void makan() {
        System.out.println("Triceratop merupakan hewan herbivora, suka makan dedaunan");
    }

    @Override
    public void berjalan() {
        System.out.println("Triceratop berjalan menggunakan empat kaki");
    }
    
    public void printInformasi(){
        System.out.println(this.getNama());
        System.out.println("Lokasi : " + this.getLokasi());
        System.out.println("Ciri : " + this.getCiriCiri());
        System.out.println("-----------------------------");
    }
}
