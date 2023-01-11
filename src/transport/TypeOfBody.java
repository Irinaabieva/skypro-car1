package transport;

public enum TypeOfBody {
        SEDUN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купэ"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");

        private final String typeOfBody;

    TypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }


    public String getTypOfBody() {
        return typeOfBody;
    }
}
