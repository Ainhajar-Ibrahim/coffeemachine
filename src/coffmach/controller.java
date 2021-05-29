package coffmach;

public class controller extends Thread implements fromuser, touser {
    static final Object lock = new Object();
    String csignal;
    public static void FillCoffee(){
        if (Main.getSignal()=="WaterOK"){
            Main.setSignal("FillCoffee");
        }

    }
    public void FillWater(){
            Main.setSignal("FillWater");
    }
    public void HeatWater(){
        if (Main.getSignal()=="WaterOK"){
            Main.setSignal("HeatWater");
        }

    }
    public void run(){
            FillWater();
            if(Main.getNb()==1){
                FillCoffee();
            }


    }}
