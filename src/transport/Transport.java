package transport;

import driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class  Transport{
    private  String brand;

    private  String model;

    private  double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();

    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();


    public Transport(String brand, String model,double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Информация не указана";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "Информация не указана";
        } else {
            this.model = model;
        }
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 2;
        }

    }

    public void startMoving() {
        System.out.println("Движение началось");
    }

    public void endMoving() {
        System.out.println("Движение законченно");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Информация не указана";
        } else {
            this.brand = brand;
        }
    }
    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void printType();

    public abstract boolean service();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public abstract void repair();
}
