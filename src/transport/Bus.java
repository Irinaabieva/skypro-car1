package transport;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус прошел питстоп");
    }

    @Override
    public int bestLapTime() {
        return (int)(Math.random()* 15);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 120);
    }
}
