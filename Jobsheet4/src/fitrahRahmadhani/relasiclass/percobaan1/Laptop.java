package fitrahRahmadhani.relasiclass.percobaan1;

public class Laptop {
    // atribute
    private String merk;
    private Processor proc;
    // default constructor
    Laptop(){}
    // constructor
    Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    // setter getter
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setProc(Processor proc){
        this.proc = proc;
    }
    public String getMerk(){
        return merk;
    }
    public Processor getCahce(){
        return proc;
    }
    // method
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
