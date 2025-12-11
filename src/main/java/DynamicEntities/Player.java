public class Player extends Entity {
    private int lvl;
    private int exp;
    private int expToNextLvl;
    private final Inventory inventory;

    public Player(int maxHP,int attack, int defense, Position startPosition) {
        super(maxHp, attack, defense, startPosition);
        this.inventory = new Inventory();
    }

    public int getLevel() {
        return this.lvl;
    }

    public int getExp() {
        return this.exp;
    }
    public int getXP2NextLevel() {
        return this.expToNextLvL;
    }

    public Inventory getInventory() {
        return this.inventory;
    }
}
