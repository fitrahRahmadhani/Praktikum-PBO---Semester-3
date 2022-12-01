package fitrahRahmadhani;

public class Oviraptor extends Dinosaurus implements IBertelur{
    private String nama = "Oviraptor";
    private String lokasi;
    private String ciriCiri;

    Oviraptor (String lokasi, String ciriCiri){
        this.lokasi = lokasi;
        this.ciriCiri = ciriCiri;
    }

    public String getNama(){return this.nama;};
    public String getLokasi(){return this.lokasi;};
    public String getCiriCiri(){return this.ciriCiri;};

    @Override
    public void bertelur() {
        System.out.println("Oviraptor berkembang biak dengan bertelur");
    }

    @Override
    public void makan() {
        System.out.println("Oviraptor merupakan hewan karnivora, suka makan molusca dan telur");
    }

    @Override
    public void berjalan() {
        System.out.println("Oviraptor berjalan menggunakan dua kaki");
    }

    public void printInformasi(){
        System.out.println(this.getNama());
        System.out.println("Lokasi : " + this.getLokasi());
        System.out.println("Ciri : " + this.getCiriCiri());
        System.out.println("-----------------------------");
    }
    
}
