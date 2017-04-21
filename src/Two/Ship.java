package Two;

/**
 * Created by Александр on 21.04.2017.
 */
public class Ship extends Vehicle {
    int passenger;
    String port;

    Ship(int price, int speed, int year, int passenger, String port){
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.passenger = passenger;
        this.port = port;
        printInfo();
    }

    void printInfo() {
        System.out.println("price " + price);
        System.out.println("speed " + speed);
        System.out.println("year " + year);
        System.out.println("port " + port);
        System.out.println("passenger " + passenger);
        System.out.println();
    }
}
