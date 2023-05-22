public class Captain extends Monster{


    public Captain(){
        super(0,3,"Captain","gives all other monsters here +2",false);

        //etb here
    }

    public boolean trigger(){
        return false;//ability here
    }
}