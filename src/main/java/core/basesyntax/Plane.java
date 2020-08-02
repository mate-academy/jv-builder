package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String color;
    private double maxSpeed;
    private double weight;
    private double price;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
        this.weight = builder.weight;
        this.price = builder.price;
    }

    public static class PlaneBuilder {
        private Plane newPlane;
        private String model;
        private String color;
        private double maxSpeed;
        private double weight;
        private double price;

        public PlaneBuilder setModel(String model) {
            newPlane.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            newPlane.color = color;
            return this;
        }

        public PlaneBuilder setMaxSpeed(double maxSpeed) {
            newPlane.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setWeight(double weight) {
            newPlane.weight = weight;
            return this;
        }

        public PlaneBuilder setPrice(double price) {
            newPlane.price = price;
            return this;
        }

        public PlaneBuilder build() {
            return this;
        }
    }
}
