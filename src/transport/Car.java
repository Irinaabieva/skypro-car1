package transport;

import java.time.LocalDate;
import java.util.Locale;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
        public static class Insurance {
            private final LocalDate validity;
            private final int cost;
            private final String number;

            public Insurance(LocalDate validity, int cost, String number) {
                if (validity == null) {
                    validity = LocalDate.now().plusDays(365);
                }
                this.validity = validity;
                if (cost <= 0) {
                    cost = 10_000;
                }
                this.cost = cost;
                if (number == null || number.isEmpty()) {
                    number = "XXXYYYZZZ";
                }
                this.number = number;
            }
            public void printCheckExpired() {
                boolean isExpired = validity.isAfter(LocalDate.now());
                if (isExpired) {
                    System.out.println("Надо менять страховку");
                }
            }

            public void printCheckNumber() {
                boolean correct = number.length() == 9;
                if (!correct) {
                    System.out.println("Номер введен некорректно");
                }

            }

            public LocalDate getValidity() {
                return validity;
            }

            public int getCost() {
                return cost;
            }

            public String getNumber() {
                return number;
            }
        }
    }



    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               String regNumber,
               int numberOfSeats,
               boolean summerTires) {
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
       setEngineVolume(engineVolume);
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
        setTransmission(transmission);

        if (bodyType != null && bodyType.isEmpty()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "Седан";
        }
        if (regNumber != null && regNumber.isEmpty()) {
            this.regNumber = regNumber;
        } else {
            this.regNumber = "номер не указан";
        }
        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = 4;
        }
        this.summerTires = summerTires;

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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && transmission.isEmpty()) {
            this.transmission = transmission;
        } else {
            this.transmission = "Коробка передач не указана";
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }
    public void changeTyres() {
        setSummerTires(!summerTires);
    }

    public boolean isValidNumber(){
        boolean result = true;
        result = result && regNumber.length() == 9;
        result = result && Character.isLetter(regNumber.charAt(0))
                        && Character.isLetter(regNumber.charAt(4))
                        && Character.isLetter(regNumber.charAt(5));
        result = result && Character.isDigit(regNumber.charAt(1))
                        && Character.isDigit(regNumber.charAt(2))
                        && Character.isDigit(regNumber.charAt(3))
                        && Character.isDigit(regNumber.charAt(6))
                        && Character.isDigit(regNumber.charAt(7))
                        && Character.isDigit(regNumber.charAt(8));

        return result;
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "Марки = " + brand +
                ", модель " + model +
                ", объем двигателя " + engineVolume +
                ", цвет " + color +
                ", год " + year +
                ", страна " + country +
                ", коробка передач " + transmission +
                ", тип кузова " +  bodyType +
                ", регистрационный номер " + regNumber +
                ", количество мест " + numberOfSeats +
                ",  " + summerTires;
    }
}
