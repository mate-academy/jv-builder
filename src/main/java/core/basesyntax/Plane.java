package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String color;
    private int weight;
    private int passengerNumber;
    private int petrolVolume;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.weight = builder.weight;
        this.passengerNumber = builder.passengerNumber;
        this.petrolVolume = builder.petrolVolume;
    }

    public static class PlaneBuilder {
        private String name;
        private String color;
        private int weight;
        private int passengerNumber;
        private int petrolVolume;

        public PlaneBuilder(String name, String color, int weight,
                            int passengerNumber, int petrolVolume) {
            this.name = name;
            this.color = color;
            this.weight = weight;
            this.passengerNumber = passengerNumber;
            this.petrolVolume = petrolVolume;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setPassengerNumber(int passengerNumber) {
            this.passengerNumber = passengerNumber;
            return this;
        }

        public PlaneBuilder setPetrolVolume(int petrolVolume) {
            this.petrolVolume = petrolVolume;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
