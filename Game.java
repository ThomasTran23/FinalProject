import java.util.ArrayList;

public class Game{

    private boolean active;

    private ArrayList<Card> allCards = new ArrayList<Card>();

    static Card[][] locations = new Card[3][4];



    //player class. Hero system different player abilites.


    


    public Game(){

        allCards.add(new Monster(1,1,"human","lowly soldier"));
        allCards.add(new Monster(2,5,"giant turtle","it's s"));
        allCards.add(new Monster(1,1,"human","lowly soldier"));
        allCards.add(new Monster(1,1,"human","lowly soldier"));
        allCards.add(new Monster(1,1,"human","lowly soldier"));
        allCards.add(new Monster(1,1,"human","lowly soldier"));
        allCards.add(new Monster(1,1,"human","lowly soldier"));
        

    }
    

    



}