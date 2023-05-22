public class Card{
    private int cost;
    private String name;
    private String description;

    public Card(int cost, String name, String description, int[] ... effect){
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost(){
        return this.cost;
    }

    public String Getname(){
        return this.name;
    }

    public boolean trigger(Player target){
        return false;
    }

    public String getDescription(){
        return description;
    }

    
}