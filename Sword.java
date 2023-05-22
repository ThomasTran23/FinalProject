public class sword extends Monster{


    public sword(){
        super(10,5,"sword","can only be played in a location with a monster to wield it",false);

        //etb here
    }

    public boolean trigger(Player target){
        return false;
    }
}