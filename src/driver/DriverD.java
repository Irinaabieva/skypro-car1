package driver;

import transport.Bus;

public class DriverD extends Driver <Bus> {
    public DriverD(String name, boolean hasDrivingLicense, int experience) {
        super(name, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Bus transport) {
        transport.startMoving();
    }

    @Override
    public void stopMove(Bus transport) {
        transport.endMoving();
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель " + getName() + " заправляет автобус " + transport.getBrand());
    }
}
