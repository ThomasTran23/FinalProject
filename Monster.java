public class Monster extends Card {
    private int power;
    private int toughness;
    private int baseP;
    private int baseT;

    public Monster(int power, int toughness, int cost, String name, String description) {
        super(cost, name,description);
        this.baseP = power;
        this.baseT = toughness;
        this.power = power;
        this.toughness = toughness;
    }

    public int getPower() {
        return power;
    }

    public int toughness() {
        return toughness;
    }

    public boolean takeDamage(int dmg) {
        toughness -= dmg;
        if (toughness <= 0) {
            return true;
        }
        return false;
    }

    public void restore() {
        toughness = baseT;
    }

    public void buff(int amm) {
        power += amm;
    }

    public void reset(){
        power = baseP;
    }

}
