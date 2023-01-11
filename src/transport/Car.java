package transport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Car extends Transport implements Competing {

    private TypeOfBody typeOfBody;
    private List<Transport> listTransports;

    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    ;

    @Override
    public void startMoving() {
        System.out.println("Автомобиль \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Автомобиль \"" + getBrand() + "\" (\"" + getModel() + "\") закончил движение");
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        }else {
            System.out.println("Тип авто: " + typeOfBody.getTypOfBody());
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " почимена!");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль прошел питстоп");
    }

    @Override
    public int bestLapTime() {
        return (int)(Math.random()* 5);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 200);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return typeOfBody == car.typeOfBody && listTransports.equals(car.listTransports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfBody, listTransports);
    }
}
