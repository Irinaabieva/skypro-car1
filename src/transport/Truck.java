package transport;

public class Truck  extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Грузовик \"" + getBrand() + "\" (\"" + getModel() + "\") закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик прошел питстоп");
    }

    @Override
    public int bestLapTime() {
        return (int)(Math.random()* 20);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 100);
    }
}
