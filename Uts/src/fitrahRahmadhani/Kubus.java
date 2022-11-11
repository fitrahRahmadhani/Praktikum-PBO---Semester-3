package fitrahRahmadhani;

public class Kubus extends BangunRuang{
    public double s;

    Kubus(){    }

    Kubus(double luas, double s){
        this.s = s;
        this.volume = luas * s;
        this.luasPermukaan = luas * 6;
        System.out.println("\nVolume kubus dengan s: " + s + " adalah = " + volume);
        System.out.println("Luas permukaan kubus dengan s: " + s + " adalah = " + luasPermukaan);
    }

}
