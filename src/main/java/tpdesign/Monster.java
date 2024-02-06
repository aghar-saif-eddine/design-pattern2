package tpdesign;

public class Monster {

    private int strength;
    private int defense;
    private int speed;

    public Monster(int strength, int defense, int speed) {
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Monster: Strength-" + strength + " Defense-" + defense + " Speed-" + speed);
    }
}
