public class DmgSpell extends Card{
    private int damage;
    private int targets;
    private boolean all;

    public DmgSpell(int damage, int targets, boolean all, int cost, String name,String description){
        super(cost,name,description);
        this.damage = damage;
        this.targets = targets;
        this.all = all;
    }

    public int getDamage(){
        return damage;
    }

    public int getTargets(){
        return targets;
    }

    public boolean getAll(){
        return all;
    }

    public boolean trigger(){
        return true;
    }
}
