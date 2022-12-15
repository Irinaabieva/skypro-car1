import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия","механическия","Хетчбэк","A141TT15",4,true);
        Car audi = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия","механическия","Седан","A122TT15",4,true);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия","автомат","Хетчбэк","A341TT15",4,true);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея","автомат","Хетчбэк","A241TT15",4,true);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея","механическия","Хетчбэк","A141EE15",4,true);
        printCar(lada);
    }
    public static void printCar(Car car) {
        System.out.println(car.toString());
    }
}