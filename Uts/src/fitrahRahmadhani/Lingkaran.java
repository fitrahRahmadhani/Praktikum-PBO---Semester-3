package fitrahRahmadhani;

public class Lingkaran extends Bola{
    Lingkaran(){    }
    
    Lingkaran(double r){
        super((2 * 3.14 * r), (3.14 * r * r), r);
        this.r = r;
    }
    @Override
    public void printLuas(){
        System.out.println("Luas lingkaran dengan r: " + r + " adalah = " + (3.14 * r * r));
    }
    @Override
    public void printKeliling(){
        System.out.println("Keliling lingkaran dengan r: " + r + " adalah = " + (2* 3.14 * r));
    }
}
