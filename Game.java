import java.util.ArrayList;

public class Game{

    private ArrayList<Card> deck = new ArrayList<Card>();

    private ArrayList<Card> hand = new ArrayList<Card>();

    private ArrayList<Card> dealer = new ArrayList<Card>();

    public Game(){
        for (int rank = 0; rank < 13; rank++) {
            for (int suit = 0; suit < 4; suit++) {
                deck.add(new Card(rank,suit));
            }
        }
    }

    public int checkHand(ArrayList<Card> hand){

    }

    public boolean flush(ArrayList<Card> hand){

    }

    public boolean straight(ArrayList<Card> hand){

    }

    public int sameRank(ArrayList<Card> hand){

        for (int i = 0; i < hand.size(); i++) {
            
        }
    }

    public ArrayList<Card> sortHand(ArrayList<Card> hand){
        for (int i = 0; i < hand.size(); i++) {
            
        }
    }

}