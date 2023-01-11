package driver;

import transport.Transport;

import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private final String name;

    private boolean hasDrivingLicense;

    private int experience;

    public Driver(String name, boolean hasDrivingLicense, int experience) {
        this.name = name;
        this.hasDrivingLicense = hasDrivingLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove(T transport);

    public abstract void stopMove(T transport);

    public abstract void refill(T transport);

    public void printInfo(T transport) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return hasDrivingLicense == driver.hasDrivingLicense && experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasDrivingLicense, experience);
    }
}
