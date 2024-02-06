package tpdesign;

public class IceMonster implements MonsterPrototype{
    private int strength = 7;
    private int defense = 8;
    private int speed = 5;

    @Override
    public Monster cloneMonster() {
        return new Monster(strength, defense, speed);
    }
}
