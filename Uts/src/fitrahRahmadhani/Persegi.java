package fitrahRahmadhani;

public class Persegi extends Kubus{
    Persegi(){    }
    
    Persegi(double s){
        super((s*s), s);
        this.s = s;
    }
    @Override
    public void printLuas(){
        System.out.println("Luas persegi dengan s: " + s + " adalah = " + (s*s));
    }
    @Override
    public void printKeliling(){
        System.out.println("Keliling persegi dengan s: " + s + " adalah = " + (4 * s));
    }
    public double getLuas(){
        return s*s;
    }
}
