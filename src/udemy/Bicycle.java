package udemy;

public class Bicycle {

    private int gear;
    private int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreaks(int decrement){

        this.speed -= decrement;

    }

    public void speedUp(int increment){

        this.speed -= increment;
    }

    public String toString() {
        return("No of gears are "+gear
                +"\n"
                + "speed of bicycle is "+speed);
    }
}
