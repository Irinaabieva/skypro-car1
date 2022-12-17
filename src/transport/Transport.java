package transport;

import java.util.Objects;

public class  Transport {
    private final String brand;

    private final String model;

    private String color;

    private final int year;

    private final String country;

    private  int maxSpeed;

    public Transport(String brand, String model, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.country = country;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "значение указанно некорректно";
        }
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(color, transport.color) && Objects.equals(country, transport.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, year, country, maxSpeed);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
