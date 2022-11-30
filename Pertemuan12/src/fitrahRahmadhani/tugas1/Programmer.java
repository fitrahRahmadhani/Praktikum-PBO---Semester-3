package fitrahRahmadhani.tugas1;

public class Programmer extends Pegawai{
    private int bonus;

    Programmer(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }
    
    public int getGaji(){
        return this.gaji;
    }

    public int getBonus(){
        return this.bonus;
    }
}
