import java.util.ArrayList;

public class Effect {

    public Effect(){

    }


    public void activate(int[] ... effects){
        for(int[] x: effects){

            if(x[0] == 0){
                draw(x[1],x[2]);
            }

            if(x[0]==1){

            }
        }
    }


    static void draw(int num,int player){
        ArrayList<Card> deck;
        ArrayList<Card> hand;

        if(player == 1){
            deck = Game.deck1;
            hand = Game.hand1;
        }else{
            deck = Game.deck2;
            hand = Game.hand2;
        }
        for (int index = 0; index < num; index++) {
            if(deck.size()>0){
                hand.add(deck.remove(0));
            }
        }
    }

    private void summonTokens(int num, int power, int toughness, int cost, String name, String description){
        
    }
    




}
