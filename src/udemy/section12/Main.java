package udemy.section12;

public class Main {

    public static void main(String[] args) {


        Theatre jag = new Theatre("Jagman", 5, 5);
        jag.getSeats();


        if(jag.reserveSeat("B02")){

            System.out.println("seat resvered please pay");

        } else {

            System.out.println("Sorry seat taken");
        }

        if(jag.reserveSeat("B02")){

            System.out.println("seat resvered please pay");

        } else {

            System.out.println("Sorry seat taken");
        }




    }

}
