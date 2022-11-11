package fitrahRahmadhani;

public class Bola extends BangunRuang {
    public double r;
    Bola(){
        
    }
    Bola(double keliling, double luas, double r){
        this.keliling = keliling;
        this.luas = luas;
        this.luasPermukaan = (4 * luas * r);
        this.volume = (4/3 * luas * r);
        System.out.println("\nVolume bola dengan r: " + r + " adalah = " + volume);
        System.out.println("Luas permukaan bola dengan r: " + r + " adalah = " + luasPermukaan);
    }

}
