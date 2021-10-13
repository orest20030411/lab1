package Task11;

public class Main {
    public static void main(final String[] args) {

        final Driver[] drivers = new Driver[2];
        drivers[0] = new Driver("Orest", "+380634355676");
        drivers[1] = new Driver("Roman", "+380674594034");
        final Taxi taxi = new Taxi("Mersedes", "BC9677TA", drivers, "5234");
        final Order order = new Order(taxi, 20, 150, 10);

        System.out.println(order);
    }
}




