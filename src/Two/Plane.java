package Two;

/**
 * Created by Александр on 21.04.2017.
 */
public class Plane extends Vehicle {
    int height;
    int passenger;

    Plane(int price, int speed, int year, int height, int passenger) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.height = height;
        this.passenger = passenger;
        printInfo();
    }

    void printInfo() {
        System.out.println("price " + price);
        System.out.println("speed " + speed);
        System.out.println("year " + year);
        System.out.println("height " + height);
        System.out.println("passenger " + passenger);
        System.out.println();
    }
}
