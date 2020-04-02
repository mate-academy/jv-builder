package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String colour;
    private int power;
    private int capacity;
    private int maxSpeed;

    private Plane(PlaneBuilder PlaneBuilder) {
        this.model = PlaneBuilder.model;
        this.colour = PlaneBuilder.colour;
        this.power = PlaneBuilder.power;
        this.capacity = PlaneBuilder.capacity;
        this.maxSpeed = PlaneBuilder.maxSpeed;
    }

    public static class PlaneBuilder {
        private String model;
        private String colour;
        private int power;
        private int capacity;
        private int maxSpeed;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setPower(int power) {
            this.power = power;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
