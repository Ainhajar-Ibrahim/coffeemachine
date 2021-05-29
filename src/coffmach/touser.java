package coffmach;

import java.util.Scanner;

public interface touser {
    public static void returnChange(int money1,int price){
        int change=money1-price;
        System.out.println("Here is your change: "+change);
    }
    public static int showMenu(){
        System.out.println("\n** Coffee Machine **\n");
        System.out.println(" Make your choice\n") ;
        System.out.println("1. regular Coffee ...........(10 Dhs)\n") ;
        System.out.println("2. tea ........(5 Dhs)\n") ;
        System.out.println("3. Coffee with milk .......(10 Dhs)\n") ;
        System.out.println("4. Coffee with sugar  ....(10 DA)\n") ;
        Scanner clavier=new Scanner(System.in);
        int nb=clavier.nextInt();
        return nb;
    }

}
