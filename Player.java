import java.util.ArrayList;

public class Player {
    private String name;
    private int health;
    private int energy;

    private ArrayList<Card> deck = new ArrayList<Card>();
    private ArrayList<Card> hand = new ArrayList<Card>();

    public Player(String name, int health, int energy){
        this.name = name;
        this.health = health;
        this.energy = energy;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int energy(){
        return energy;
    }

    public void setDeck(ArrayList<Card> deck){
        this.deck = deck;
    }

    public void draw(int num){
        for (int index = 0; index < num; index++) {
            if(deck.size()>0){
                hand.add(deck.remove(0));
            }
        }
    }

    public void addToHand(Card card){
        hand.add(card);
    }

    public void addToDeck(Card card){
        deck.add(card);
    }
    
}
