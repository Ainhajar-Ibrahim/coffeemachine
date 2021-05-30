package coffmach;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main implements fromuser,touser {
    private static int price;
    private static int money1;
    static signal  message = new signal(100);
    public static int getNb() {
        return nb;
    }

    public static void setNb(int nb) {
        Main.nb = nb;
    }

    private static int nb;

    public static int getNbc() {
        return nbc;
    }

    public static void setNbc(int nbc) {
        Main.nbc = nbc;
    }

    private static int nbc=0;


    public static void main(String[] args) throws InterruptedException {
        nb=touser.showMenu();
        money1=fromuser.insertCoin();


        controller c = new controller(message);
        hardware h = new hardware(message);

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
                            nbc=touser.showCoffeeMenu();

                            System.out.println("your coffee will be ready in no time");
                            h.start();
                            c.start();


                            break;



                        default:
                            price=0;
                            System.out.println("you can only insert 5 or 10");
                            touser.returnChange(money1,price);
                            touser.showMenu();
                            break;

                    }

                    break;}

                case 2:
                {

                    switch(money1){


                        case 5:
                            price=5;
                            System.out.println("your tea will be ready in no time");
                            h.start();
                            c.start();
                            try {
                                Thread.sleep(400); // In your case it would be: Thread.sleep(100);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                           System.out.println("tea is ready!");
                            break;



                        case 10:
                            price=5;
                            System.out.println("your tea will be ready in no time");
                            touser.returnChange(money1,price);
                            h.start();
                            c.start();
                            try {
                                Thread.sleep(400); // In your case it would be: Thread.sleep(100);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("tea is ready!");
                            break;



                        default:
                            price=0;
                            System.out.println("you can only insert 5 or 10");
                            touser.returnChange(money1,price);
                            touser.showMenu();
                            break;
                    }

                    break;}


                default:
                    System.out.println("unknown command");
                    break;



        }



    }
}
