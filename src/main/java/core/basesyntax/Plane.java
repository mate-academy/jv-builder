package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String color;
    private int weight;
    private int maxSpeed;
    private int passengerCapacity;

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.color = planeBuilder.color;
        this.weight = planeBuilder.weight;
        this.maxSpeed = planeBuilder.maxSpeed;
        this.passengerCapacity = planeBuilder.passengerCapacity;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int weight;
        private int maxSpeed;
        private int passengerCapacity;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
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

        public PlaneBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
