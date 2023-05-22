public class Spy extends Monster{


    public Spy(){
        super(-5,3,"Spy","can be played on your oponents board",true);

        //etb here
    }

    public boolean trigger(){
        return false;//ability here
    }
}