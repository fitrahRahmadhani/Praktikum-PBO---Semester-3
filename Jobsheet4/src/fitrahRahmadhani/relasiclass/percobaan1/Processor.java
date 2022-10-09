package fitrahRahmadhani.relasiclass.percobaan1;

public class Processor {
    // Atribut
    private String merk;
    private double cahce;
    // default constructor
    Processor(){    }
    // constructor
    Processor(String merk, double cahce){
        this.merk = merk;
        this.cahce = cahce;
    }
    // setter getter
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setCahce(double cahce){
        this.cahce = cahce;
    }
    public String getMerk(){
        return merk;
    }
    public double getCahce(){
        return cahce;
    }
    // method
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cahce);
    }
}

