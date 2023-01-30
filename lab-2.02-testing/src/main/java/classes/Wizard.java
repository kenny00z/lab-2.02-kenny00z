package classes;

public class Wizard extends Player{

    private int intelligence;


    public Wizard(int health, int strength, int lives, int mastery, int armor, int intelligence) {
        super(health, strength, lives, mastery, armor);

        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
