public class hydra extends Monster{


    public hydra(){
        super(6,6,"hydra","when you play hydra, play 2 5 power heads in the other lanes",false);

        //etb here
    }

    public boolean trigger(Player target){
        return false;
    }
}