package classes;

public class Elf extends Player{

    private int agility;


    public Elf(int health, int strength, int lives, int mastery, int armor, int agility) {
        super(health, strength, lives, mastery, armor);

        this.agility = agility;
    }


    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
}
