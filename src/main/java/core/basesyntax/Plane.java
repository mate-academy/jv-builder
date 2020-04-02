package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private int capacity;
    private int weight;
    private int maxSpeed;
    private int noiseLevel;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.capacity = builder.capacity;
        this.weight = builder.weight;
        this.maxSpeed = builder.maxSpeed;
        this.noiseLevel = builder.noiseLevel;
    }

    public static class PlaneBuilder {
        private String model;
        private int capacity;
        private int weight;
        private int maxSpeed;
        private int noiseLevel;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setNoiseLevel(int noiseLevel) {
            this.noiseLevel = noiseLevel;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
