package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String brand;
    private String model;
    private int speed;
    private int value;
    private String countryOfArrival;

    private Plane(PlaneBuilder planeBuilder) {
        this.brand = planeBuilder.brand;
        this.model = planeBuilder.model;
        this.speed = planeBuilder.speed;
        this.value = planeBuilder.value;
        this.countryOfArrival = planeBuilder.countryOfArrival;
    }

    public static class PlaneBuilder {
        private String brand;
        private String model;
        private int speed;
        private int value;
        private String countryOfArrival;

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setValue(int value) {
            this.value = value;
            return this;
        }

        public PlaneBuilder setCountryOfArrival(String countryOfArrival) {
            this.countryOfArrival = countryOfArrival;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
