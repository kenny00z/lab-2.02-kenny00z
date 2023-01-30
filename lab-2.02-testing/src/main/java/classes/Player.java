package classes;

public abstract class Player {

    private int health;

    private int fullHealth;

    private int strength;

    private int lives;

    private int mastery;

    private int armor;

    public Player(int health, int strength, int lives, int mastery, int armor) {
        this.health = health;
        this.fullHealth = health;
        this.strength = strength;
        this.lives = lives;
        this.mastery = mastery;
        this.armor = armor;
    }


    public void loseOneLife (){
    if(health <= 0){
        health = fullHealth;
        lives--;
    }

    }

    public void attack(Player player){ //player , el que recibe el daño.
        player.setHealth(player.getHealth() - getStrength());
        //player(dante) es el argumento que le pasamos por eso dentro del parentesis pasamos player.getHealth() ya que estamos trayendonos su vida y restandole la fuerza que nos traemos del atacante al llamar a la funcion, ej; kratos.attack(dante)
        // referenciar en PlayerTest.java
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        loseOneLife();
    }

    public int getFullHealth() {
        return fullHealth;
    }

    public void setFullHealth(int fullHealth) {
        this.fullHealth = fullHealth;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getMastery() {
        return mastery;
    }

    public void setMastery(int mastery) {
        this.mastery = mastery;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
