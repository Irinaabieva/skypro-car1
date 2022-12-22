package transport;

public class Bus extends Transport implements Competing {
    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public enum BodyType {
        SEDUN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купэ"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");

        private final String bodyType;


        @Override
        public String toString() {
            return "Название типа кузова на русском языке - " + valueOf(bodyType);
        }

        BodyType(String bodyType) {
            this.bodyType = bodyType;

        }

        public String getBodyType() {
            return bodyType;
        }

    }

    @Override
    public void startMoving() {
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус \"" + getBrand() + "\" (\"" + getModel() + "\") начал движение");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        }else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + "до" + capacity.getTo());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус прошел питстоп");
    }

    @Override
    public int bestLapTime() {
        return (int)(Math.random()* 15);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 120);
    }
}
