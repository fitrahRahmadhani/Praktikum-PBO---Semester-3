package fitrahRahmadhani;

public class Segitiga extends LimasSegitiga{
    public double a, t;

    Segitiga(){ }

    Segitiga(double a, double t){
        this.a = a;
        this.t = t;
    }
    @Override
    public void printLuas(){
        this.luas = 0.5*a*t;
        System.out.println("Luas segitiga dengan alas: " + a + " dan t: "+ t  +" adalah = " + luas);
    }
    @Override
    public void printKeliling(){
        this.keliling = a * 3;
        System.out.println("\nKeliling segitiga dengan alas: " + a + " dan t: "+ t  +" adalah = " + keliling);
    }
    public double getLuas(){
        return this.luas;
    }
}
