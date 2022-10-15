package fitrahRahmadhani.percobaan2;

public class ClassB extends ClassA{
    protected int z;

    public void setZ(int Z){
        this.z = z;
    }
    public void getNilaiZ(){
        System.out.println("Nilai Z: " + z);
    }
    public void getJumlah(){
        System.out.println("Jumlah: " + (x + y + z));
    }
}
