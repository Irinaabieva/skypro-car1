import driver.Driver;
import driver.DriverB;
import jdk.jfr.Category;
import transport.*;


public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Лада", "Granta", 1.6, TypeOfBody.MINIVAN);
        Car audi = new Car("Audi", "A8", 3.0,TypeOfBody.CROSSOVER);
        Car bmw = new Car("BMW", "Z8", 3.0,TypeOfBody.SEDUN);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4,TypeOfBody.MINIVAN);
        Bus ikarus = new Bus("ikarus", "f35", 3.6, Capacity.LARGE);
        Bus bus2 = new Bus("bus2", "f35", 3.6,Capacity.MEDIUM);
        Bus bus3 = new Bus("bus3", "f36", 3.6,Capacity.MEDIUM);
        Bus bus4 = new Bus("bus4", "f37", 3.6,Capacity.EXTRA_SMALL);
        Bus bus5 = new Bus("bus5", "f38", 3.6,Capacity.MEDIUM);
        Truck truck1 = new Truck("truck1", "m1", 5.0,Weight.N1);
        Truck truck2 = new Truck("truck2", "m2", 5.0,Weight.N3);
        Truck truck3 = new Truck("truck3", "m3", 5.0,Weight.N2);
        Truck truck4 = new Truck("truck4", "m4", 5.0,Weight.N1);
        DriverB driverB = new DriverB("Иван иванович", true,10);
        printInfo(driverB,audi);
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }
    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + "не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printInfo(Driver<?> driver, Transport transport) {
        transport.printType();
    }


}