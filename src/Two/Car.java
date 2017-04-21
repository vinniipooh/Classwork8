package Two;

/**
 * Created by Александр on 21.04.2017.
 */
public class Car extends Vehicle {
    Car(int price, int speed, int year){
        this.price = price;
        this.speed = speed;
        this.year = year;
        printInfo();
    }

    void printInfo() {
        System.out.println("price " + price);
        System.out.println("speed " + speed);
        System.out.println("year " + year);
        System.out.println();
    }
}
