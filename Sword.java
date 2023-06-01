public class Sword extends Monster{


    public Sword(){
        super(10,5,"Sword","can only be played in a location with a monster to wield it",false);

        //etb here
    }

    public boolean trigger(Player target){
        return false;
    }
}