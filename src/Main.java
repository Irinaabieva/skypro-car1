import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import jdk.jfr.Category;
import transport.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {



        Mechanic<Car> petr = new Mechanic<>("Петр", "Петров", "Pirelli");
        Mechanic<Transport> alexey = new Mechanic<>("Алексей", "Петров", "Pirelli");
        Sponsor lucoil = new Sponsor("Лукойл", 2_000_000);
        Sponsor michelin = new Sponsor("Michelin", 3_000_000);


        Car lada = new Car("Лада", "Granta", 1.6, TypeOfBody.MINIVAN);
        Car audi = new Car("Audi", "A8", 3.0,TypeOfBody.CROSSOVER);
        Car bmw = new Car("BMW", "Z8", 3.0,TypeOfBody.SEDUN);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4,TypeOfBody.MINIVAN);

        kia.addDriver(new DriverB("Иван иванович", true,10));
        kia.addSponsor(lucoil,michelin);

        Bus ikarus = new Bus("ikarus", "f35", 3.6, Capacity.LARGE);
        Bus bus2 = new Bus("bus2", "f35", 3.6,Capacity.MEDIUM);
        Bus bus3 = new Bus("bus3", "f36", 3.6,Capacity.MEDIUM);
        Bus bus4 = new Bus("bus4", "f37", 3.6,Capacity.EXTRA_SMALL);
        Bus bus5 = new Bus("bus5", "f38", 3.6,Capacity.MEDIUM);

        ikarus.addDriver(new DriverD("Семенов Семен Семенович", true,10));
        ikarus.addMechanic(alexey);
        ikarus.addSponsor(lucoil);

        Truck truck1 = new Truck("truck1", "m1", 5.0,Weight.N1);

        truck1.addDriver(new DriverC("Иван иванович", true,10));
        truck1.addMechanic(alexey);
        truck1.addSponsor(michelin);

        Map<Transport,Mechanic<?>> mechanicMap = new HashMap<>();
        mechanicMap.put(kia, petr);
        mechanicMap.put(ikarus, alexey);
        mechanicMap.put(truck1, alexey);
        System.out.println(mechanicMap.get(ikarus));


//        Truck truck2 = new Truck("truck2", "m2", 5.0,Weight.N3);
//        Truck truck3 = new Truck("truck3", "m3", 5.0,Weight.N2);
//        Truck truck4 = new Truck("truck4", "m4", 5.0,Weight.N1);
//        DriverB driverB = new DriverB("Иван иванович", true,10);



//        List<Transport> transports = List.of(kia, ikarus, truck1);
//
//        for (Transport transport : transports) {
//            printInfo(transport);
//        }
    }

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: ");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getName());
        }
        System.out.println("Спонсоры: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики: ");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + " из " + mechanic.getCompany());
        }
        System.out.println();
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