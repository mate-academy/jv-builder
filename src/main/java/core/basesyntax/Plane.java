package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String type;
    private int length;
    private int weight;
    private int speed;
    private String brand;

    private Plane(PlaneBuilder planeBuilder) {
        this.type = planeBuilder.type;
        this.length = planeBuilder.length;
        this.weight = planeBuilder.weight;
        this.speed = planeBuilder.speed;
        this.brand = planeBuilder.brand;
    }

    public static class PlaneBuilder {
        private String type;
        private int length;
        private int weight;
        private int speed;
        private String brand;

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
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

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
