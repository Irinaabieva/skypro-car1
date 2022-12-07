public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "Марки = " + brand +
                ", модель " + model +
                ", объем двигателя " + engineVolume +
                ", цвет " + color +
                ", год " + year +
                ", страна " + country ;
    }
}
