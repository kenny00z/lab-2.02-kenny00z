package classes;

public class Warrior extends Player{

    private int rage;


    public Warrior(int health, int strength, int lives, int mastery, int armor,int rage) {
        super(health,strength, lives, mastery, armor);

        this.rage = rage;
    }


    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }


}
