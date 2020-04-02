package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String brand;
    private String model;
    private int humanCapacity;
    private int maxSpeed;
    private int engineAmount;

    private Plane(PlaneBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.humanCapacity = builder.humanCapacity;
        this.maxSpeed = builder.maxSpeed;
        this.engineAmount = builder.engineAmount;
    }

    public class PlaneBuilder {
        private String brand;
        private String model;
        private int humanCapacity;
        private int maxSpeed;
        private int engineAmount;

        public PlaneBuilder setBrand(String brand) {
            Plane.this.brand = brand;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            Plane.this.model = model;
            return this;
        }

        public PlaneBuilder setHumanCapacity(int humanCapacity) {
            Plane.this.humanCapacity = humanCapacity;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            Plane.this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setEngineAmount(int engineAmount) {
            Plane.this.engineAmount = engineAmount;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

    }
}

