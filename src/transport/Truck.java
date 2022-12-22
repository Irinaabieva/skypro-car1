package transport;

public class Truck  extends Transport implements Competing {

    private Weight weight;

    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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
    public void printType() {
        if (weight == null) {
            System.out.println("Данных по авто недостаточно");
        }else {
            String from = weight.getFrom() == null ? "" : "от " + weight.getFrom() + " ";
            String to = weight.getTo() == null ? "" : "до " + weight.getTo() + " ";
            System.out.println("Грузоподъемность авто: от " + from + to);
        }
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
