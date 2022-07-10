package publications;


import java.util.Scanner;

public class CD extends Publication {

    private int minutes;

    public CD() {

    }

    public CD(String name, float price, int minutes) {
        super(name, price);
        this.minutes = minutes;
    }



    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }



}
