package fitrahRahmadhani.tugas;

public class JumpingZombie extends Zombie{
    JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    @Override
    public void heal() {
        if(this.level == 1){
            this.health += (this.health * 3 / 10);
        }else if(this.level == 2){
            this.health += (this.health * 4 / 10);
        }else if(this.level == 3){
            this.health += (this.health * 5 / 10);
        }
    }

    @Override
    public void destroyed() {
        if(this.health > 0){
            this.health -= (this.health * 1 / 10);
        }else if(this.health <= 0){
            this.health = 0;
            System.out.println("Jumping Zombie is dead");
        }
    }
    
    @Override
    public String getZombieInfo(){
        return "-- Jumping Zombie --\n" 
        + "Health status: " + this.health +"\n"
        + "Level status: " + this.level + "\n";
    }
}
