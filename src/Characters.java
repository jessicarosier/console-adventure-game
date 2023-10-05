public class Characters {

    public String name;
    public int health;
    public int attack;
    public int defense;

    public Characters(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }


    public void setHealth(int health) {
        this.health = health;
    }

}
