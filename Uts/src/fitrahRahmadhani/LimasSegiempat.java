package fitrahRahmadhani;

public class LimasSegiempat extends BangunRuang{
    public double tinggi;
    public double s;

    LimasSegiempat(){ }

    LimasSegiempat(double luas, double tinggi){
        this.luas = luas;
        this.tinggi = tinggi;
        this.s = luas/2;
    }
    @Override
    public void printVolume(){
        this.volume = (luas * tinggi/3);
        System.out.println("Volume Limas segitempat dengan t: " + tinggi + " dan LA = " + luas + " adalah = " + volume);
    }
    @Override
    public void printLuasPermukaan(){
        this.luasPermukaan = (luas + (4* (s*tinggi/2)));
        System.out.println("Luas permukaan Limas segiempat dengan t: " + tinggi + " dan LA = " + luas + " adalah = " + luasPermukaan);
    }

}
