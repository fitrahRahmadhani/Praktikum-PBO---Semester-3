package fitrahRahmadhani.bangunDatar;

public class Lingkaran extends BangunDatar{
    public float r;

    @Override
    public float luas(){
        float luas = 3.14f * r * r;
        System.out.println("Luas lingkaran dengan jari-jari: " + r + " adalah = " + luas);
        return luas;
    }

    @Override
    public float keliling(){
        float keliling = 2 * 3.14f * r;
        System.out.println("keliling lingkaran dengan jari-jari: " + r + " adalah = " + keliling);
        return keliling;
    }
}
