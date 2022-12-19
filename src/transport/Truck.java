package transport;

public class Truck  extends Transport {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Движение грузового автомобиля началось");
    }

    @Override
    public void endMoving() {
        System.out.println("Движение грузового автомобиля закончилось");
    }
}
