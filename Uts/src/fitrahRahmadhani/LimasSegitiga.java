package fitrahRahmadhani;

public class LimasSegitiga extends BangunRuang{
    public double tinggi;
    LimasSegitiga(){    }
    LimasSegitiga(double luas, double tinggi){
        this.luas = luas;
        this.tinggi = tinggi;
    }
    @Override
    public void printVolume(){
        this.volume = (luas * tinggi/3);
        System.out.println("Volume Limas segitiga dengan t: " + tinggi + " dan LA = " + luas + " adalah = " + volume);
    }
    @Override
    public void printLuasPermukaan(){
        this.luasPermukaan = (4 * luas);
        System.out.println("Luas permukaan Limas segitiga dengan t: " + tinggi + " dan LA = " + luas + " adalah = " + luasPermukaan);
    }
}
