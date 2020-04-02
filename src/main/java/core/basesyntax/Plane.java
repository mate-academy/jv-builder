package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String type;
    private String typeEngine;
    private int range;
    private int maxSpeed;
    private int numberOfEngines;
    private int capacity;

    private Plane(PlaneBuilder builder) {
        this.type = builder.type;
        this.typeEngine = builder.typeEngine;
        this.range = builder.range;
        this.maxSpeed = builder.maxSpeed;
        this.numberOfEngines = builder.numberOfEngines;
        this.capacity = builder.capacity;
    }

    public static class PlaneBuilder {
        private String type;
        private String typeEngine;
        private int range;
        private int maxSpeed;
        private int numberOfEngines;
        private int capacity;

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setTypeEngine(String typeEngine) {
            this.typeEngine = typeEngine;
            return this;
        }

        public PlaneBuilder setRange(int range) {
            this.range = range;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setNumberOfEngines(int numberOfEngines) {
            this.numberOfEngines = numberOfEngines;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
