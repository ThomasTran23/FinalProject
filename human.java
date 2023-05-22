public class human extends Monster{


    public human(){
        super(1,1,"human","just a normal guy",false);

        //etb here
    }

    public boolean trigger(Player target){
        return false;
    }
}