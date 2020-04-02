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

    private Plane(PlaneBuilder planeBuilder) {
    }

    public class PlaneBuilder {
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

        public PlaneBuilder build() {
            return PlaneBuilder.this;
        }

    }
}

