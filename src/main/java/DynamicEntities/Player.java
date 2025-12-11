import javax.swing.text.Position;

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

    public void setInventory(Inventory newInventory) {
        this.inventory = newInventory;
    }

    public void move() {

    }

    public void gainExperience(int amount) {
        this.experience += amount;
        checkLevelUp();
    }

    public void levelUp() {
        level++;
        experience -= expToNextLvl;
        expToNextLvl = calculateExperienceToNextLevel(level);

        setMaxHP(getMaxHP() + calculateHPIncrease());
        setAttack(getAttack() + calculateAttackIncrease());
        setDefense(getDefense() + calculateDefenseIncrease());
        setCurrentHP(getMaxHP());
        onLevelUp();
    }

    public void useSpecialAbility(Character target) {
    }

    public boolean effectExpired() {
        return true;
    }

    public int gainLevel() {
        levelUp();
        return level;
    }
    
}
