package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String name;
    private double maxSpeed;
    private double weight;
    private double fuelTankCapacity;
    private double maxDistance;

    public Plane(String name, double maxSpeed, double weight,
                 double fuelTankCapacity, double maxDistance) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.fuelTankCapacity = fuelTankCapacity;
        this.maxDistance = maxDistance;
    }

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.maxSpeed = builder.maxSpeed;
        this.weight = builder.weight;
        this.fuelTankCapacity = builder.fuelTankCapacity;
        this.maxDistance = builder.maxDistance;
    }

    public static class PlaneBuilder {
        private String name;
        private double maxSpeed;
        private double weight;
        private double fuelTankCapacity;
        private double maxDistance;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setFuelTankCapacity(double fuelTankCapacity) {
            this.fuelTankCapacity = fuelTankCapacity;
            return this;
        }

        public PlaneBuilder setMaxDistance(double maxDistance) {
            this.maxDistance = maxDistance;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
