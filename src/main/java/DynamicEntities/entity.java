package DynamicEntities;

public class Entity implements Combatant, Interactable {
    private int hp;
    private int maxHP;
    private int attack;
    private int defense;
    private Position position;

    public Entity(int baseMaxHP, int baseAttack, int baseDefense, Position startPosition) {
        this.maxHp = baseMaxHp;
        this.hp = maxHP;
        this.attack = baseAttack;
        this.defense = baseDefense;
        this.position = startPosition;
    }

     public int geHP() {
        return this.hp;
    }

    public int getMaxHP() {
        return this.maxHP;
    }

    public Position getPosition() {
    return this.position;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }


    protected void setMaxHP(int newMaxHP) {
        this.maxHp = newMaxHp;
    }


}
