package coffmach;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main implements fromuser,touser {
    private static int price;
    private static int money1;

    public static int getNb() {
        return nb;
    }

    public static void setNb(int nb) {
        Main.nb = nb;
    }

    private static int nb;
    private static String signal;

    public static String getSignal() {
        return signal;
    }

    public static void setSignal(String signal) {
        Main.signal = signal;
    }

    public static void main(String[] args) throws InterruptedException {
        nb=touser.showMenu();
        money1=fromuser.insertCoin();


        controller c = new controller();
        hardware h = new hardware();

            switch(nb){
                case 1:{


                    switch(money1){
                        case 5:
                            price=0;
                            System.out.println("not enough money");
                            touser.returnChange(money1,price);
                            touser.showMenu();
                            break;
                        case 10:
                            price=10;
                            System.out.println("your coffee will be ready in no time");
                            c.run();
                            break;

                        default: System.out.println("wrong choice1");
                                 break;
                    }
                    break;}

                case 2:
                    System.out.println("9hwa");
                    break;
                default:
                    System.out.println("9awed");
                    break;



        }



    }
}
