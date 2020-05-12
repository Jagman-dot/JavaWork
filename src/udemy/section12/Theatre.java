package udemy.section12;

        import java.util.ArrayList;
        import java.util.List;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    //Constructor that will create the rows and seats for theatre
    public Theatre(String theatreName, int numRow, int seatsPerRow){

        this.theatreName = theatreName;

        int lastRow = 'A' + (numRow - 1);

        // for loop that creates rows
        for(char row = 'A'; row <= lastRow; row++){

            // for loop that creates the each seat within that row
            for (int seatnum = 1; seatnum <= seatsPerRow; seatnum++){

                Seat seat = new Seat(row + String.format("%02d", seatnum));
                seats.add(seat);
            }
        }

    }

    public String getTheatreName(){
        return this.theatreName;
    }


    public boolean reserveSeat(String seatNumber){

        Seat requestSeat = null;

        for(Seat seat : seats){

            if(seat.getSeatNumber().equals(seatNumber)){

                requestSeat = seat;
                break;
            }
        }
        if(requestSeat == null){

            System.out.println("There is no seat " + seatNumber);

            return false;
        }

        return requestSeat.reserve();
    }

    //for testing
    public void getSeats(){

        for(Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }



    private class Seat{

        private final String seatNumber;
        private boolean reserved;


        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {

            // if this not reserved then it will reserve it
            if (!this.reserved) {
                this.reserved = true; // so we are not able to book the same seat again
                System.out.println("Seat: " + seatNumber + " reserved");
                return true;
            } else {
                System.out.println("Sorry this seat is reserved");
                return false;
            }

        }

        public boolean cancel() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }
    }


}