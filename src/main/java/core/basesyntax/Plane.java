package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String model;
    private int maxSpeed;
    private int numberOfEngines;
    private String type;
    private int carryingCapacity;

    public Plane(String model, int maxSpeed, int numberOfEngines,
                 String type, int carryingCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.numberOfEngines = numberOfEngines;
        this.type = type;
        this.carryingCapacity = carryingCapacity;
    }

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.maxSpeed = builder.maxSpeed;
        this.numberOfEngines = builder.numberOfEngines;
        this.type = builder.type;
        this.carryingCapacity = builder.carryingCapacity;
    }

    public class PlaneBuilder {
        private String model;
        private int maxSpeed;
        private int numberOfEngines;
        private String type;
        private int carryingCapacity;

        public PlaneBuilder setModel(String model) {
            this.model = model;
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

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setCarryingCapacity(int carryingCapacity) {
            this.carryingCapacity = carryingCapacity;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}