public class smaug extends Monster{


    public smaug(){
        super(10,6,"smaug","poisons and weakens all enemies for -1",true);

        //etb here
    }

    public boolean trigger(Player target){
        return false;
    }
}