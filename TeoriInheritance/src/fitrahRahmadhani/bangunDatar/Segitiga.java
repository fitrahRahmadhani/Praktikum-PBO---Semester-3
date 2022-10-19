package fitrahRahmadhani.bangunDatar;

public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    @Override
    public float luas(){
        float luas = 0.5f * alas * tinggi;
        System.out.println("Luas segitiga dengan alas: " + alas + " dan tinggi: " + tinggi + " adalah = " + luas);
        return luas;
    }
}
