package transport;

import java.time.LocalDate;
import java.util.Locale;

public class Car extends Transport implements Competing {

    private TypeOfBody typeOfBody;

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


}
