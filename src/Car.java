public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
        if (color == null || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
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
