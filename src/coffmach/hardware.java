package coffmach;

public class hardware extends Thread implements fromuser, touser {
    private static String hsignal;
    static public void WaterOK(){

        if(Main.getSignal()=="FillWater"){
        Main.setSignal("WaterOK");}


    }
    public static void Warm(){
        if(Main.getSignal()=="HeatWater"){
            Main.setSignal("Warm");}
    }
    public static void CoffeeOK(){
        if(Main.getSignal()=="FillCoffee"){
            Main.setSignal("CoffeeOK");}
    }

    public void run(){
        while (true){
    WaterOK();
}
    }
}
