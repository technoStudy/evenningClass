package day39.questions;


import java.time.LocalTime;

class Evening{
    public String weather;
    public int temperature;

    public Evening(String weather){
        //this(); recursive constructor invocation
        this.weather = weather;
        this.temperature = 65;
    }

    public Evening(){
        this("Sunny", 100);
        this.temperature = 100;


        //this.weather = "Sunny";
    }


    public Evening(String w, int t) {
    }
}


class Iftar{
    LocalTime time;

    public Iftar(){
    }

    public Iftar(LocalTime time){
        this.time = time;
    }
}


public class Q8 {

    public Q8(boolean b){
        if(b){
            return;
        }

        System.out.println("default constructor");

    }

    public static void main(String[] args) {
//        Evening e = new Evening();
//        e.temperature = 100;

//        Q8 q = new Q8(false);
//        q = new Q8(true);



        Iftar monday = new Iftar();
        System.out.println("Time1: " + monday.time);

        monday = new Iftar(LocalTime.now());
        System.out.println("Time2: " + monday.time);

    }

}
