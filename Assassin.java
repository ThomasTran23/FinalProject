public class Assassin extends Monster{


    public Assassin(){
        super(0,4,"Assassin","kills your oponent's biggest monster",true);

        //etb here
    }

    public boolean trigger(){
        return false;//ability here
    }
}