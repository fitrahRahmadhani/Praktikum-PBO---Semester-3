package fitrahRahmadhani.tugas;

public class Barrier implements IDestroyable{
    private int strength;

    Barrier(int strength){
        this.strength = strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return strength;
    }

    @Override
    public void destroyed() {
        if(strength > 0){
            strength -= 9;
        }else if(strength <= 0){
            strength = 0;
            System.out.println("Barrier is broke");
        }
    }

    public String getBarrierInfo(){
        return "Barrier Strength: " + this.strength;
    }
}
