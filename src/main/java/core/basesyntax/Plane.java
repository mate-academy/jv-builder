package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String color;
    private int speed;
    private int weight;
    private String brand;

    private Plane(PlaneBuilder builder) {
        model = builder.model;
        color = builder.color;
        speed = builder.speed;
        weight = builder.weight;
        brand = builder.brand;
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int speed;
        private int weight;
        private String brand;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
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

