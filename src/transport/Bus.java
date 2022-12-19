package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Движение автобуса началось");
    }

    @Override
    public void endMoving() {
        System.out.println("Движение автобуса закончилось");
    }

}
