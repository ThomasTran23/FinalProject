public class Monster extends Card {
    private int power;
    private boolean enemy;//if true, target other player, if false target self.
    private int baseP;


    public Monster(int power, int cost, String name, String description,boolean enemy) {
        super(cost, name,description);
        this.baseP = power;
        this.enemy = enemy;
        this.power = power;
   
    }

    public int getPower() {
        return power;
    }

    public void buff(int amm) {
        power += amm;
    }

    public void reset(){
        power = baseP;
    }

    public boolean getEnemy(){
        return enemy;
    }

}
