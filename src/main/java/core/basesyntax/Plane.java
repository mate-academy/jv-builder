package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int weight;
    private int maxSpeed;
    private int passengersCount;
    private String colour;
    private String brand;

    private Plane(PlaneBuilder builder) {
        this.weight = builder.weight;
        this.maxSpeed = builder.maxSpeed;
        this.passengersCount = builder.passengersCount;
        this.colour = builder.colour;
        this.brand = builder.brand;
    }

    public static class PlaneBuilder {
        private int weight;
        private int maxSpeed;
        private int passengersCount;
        private String colour;
        private String brand;

        public PlaneBuilder() {
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setPassengersCount(int passengersCount) {
            this.passengersCount = passengersCount;
            return this;
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
