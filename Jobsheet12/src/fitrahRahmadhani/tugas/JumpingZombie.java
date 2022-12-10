package fitrahRahmadhani.tugas;

public class JumpingZombie extends Zombie{
    JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    @Override
    public void heal() {
        if(level == 1){
            health += (0.3 * health);
        }else if(level == 2){
            health += (0.4 * health);
        }else if(level == 3){
            health += (0.5 * health);
        }
    }

    @Override
    public void destroyed() {
        health -= (0.01 * health);
    }
    
    @Override
    public String getZombieInfo(){
        return "-- Jumping Zombie --\n" 
        + "Health status: " + this.health +"\n"
        + "Level status: " + this.level;
    }
}
