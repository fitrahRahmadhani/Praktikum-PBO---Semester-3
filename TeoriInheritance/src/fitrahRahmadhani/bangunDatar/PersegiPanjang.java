package fitrahRahmadhani.bangunDatar;

public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;

    @Override
    public float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas persegi panjang dengan panjang: " + panjang + " dan lebar: " + lebar + " adalah = " + luas);
        return luas;
    }

    @Override
    public float keliling(){
        float keliling = 2 * (panjang + lebar);
        System.out.println("keliling persegi panjang dengan panjang: " + panjang + " dan lebar: " + lebar + " adalah = " + keliling);
        return keliling;
    }
}
