package transport;

import java.util.Objects;

public class  Transport{
    private  String brand;

    private  String model;

    private  double engineVolume;


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

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Информация не указана";
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    //    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null || color.isEmpty()) {
//            color = "значение указанно некорректно";
//        }
//        this.color = color;
//    }

//    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed <= 0) {
//            this.maxSpeed = 100;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Transport transport = (Transport) o;
//        return year == transport.year && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(color, transport.color) && Objects.equals(country, transport.country);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(brand, model, color, year, country, maxSpeed);
//    }
//
//    @Override
//    public String toString() {
//        return "Transport{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", color='" + color + '\'' +
//                ", year=" + year +
//                ", country='" + country + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                '}';
//    }

    public double getEngineVolume() {
        return engineVolume;
    }

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
}
