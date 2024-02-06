package tpdesign;

public class FireMonster implements MonsterPrototype{
    private int strength = 10;
    private int defense = 5;
    private int speed = 8;

    @Override
    public Monster cloneMonster() {
        return new Monster(strength, defense, speed);
    }
}
