package driver;

import transport.Truck;

public class DriverC extends Driver <Truck> {
    public DriverC(String name, boolean hasDrivingLicense, int experience) {
        super(name, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        transport.startMoving();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.endMoving();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getName() + " заправляет грузовик " + transport.getBrand());
    }
}
