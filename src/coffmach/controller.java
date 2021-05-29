package coffmach;



public class controller extends Thread  {
    signal s;

    public controller(signal m) {
        this.s=m;

    }

    @Override
    public void run() {
        super.run();

        synchronized (s){
                /*
                sent
                * */

            send(s, signal.FILL_WATER);

            try {
                s.wait();
                System.out.println(s.getMessage()+"water has been filled");
                if(s.getMessage() == signal.OK_WATER){

                    switch (Main.getNb()){

                        case 1: send(s, signal.FILL_COFFEE);
                            break;
                        case 2: send(s, signal.HEAT_WATER);
                            break;



                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                s.wait();
                System.out.println(s.getMessage());







            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch(Main.getNbc()){
                case 0:
                    System.out.println("please wait");
                    break;
                case 1: send(s, signal.ADD_MILK);
                    break;
                case 2: send(s, signal.ADD_SUGAR);
                    break;
                case 3:{
                    send(s,signal.ADD_BOTH);
                  break;
                }

                case 4:
                    System.out.println("a regular coffee with no additions");
                    break;

                default:
                    System.out.println("unknown command ");
                    break;
            }


            try {
                s.wait();
                System.out.println(s.getMessage());







            } catch (InterruptedException e) {
                e.printStackTrace();}






        }

    }


    public void send(signal s, int c){

        s.setMessage(c);
        s.notify();
    }

}
