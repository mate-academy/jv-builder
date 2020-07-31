package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String brand;
    private String model;
    private int capacity;
    private int maxSpeed;
    private int rangeOfFlight;

    public Plane(PlaneBuilder planeBuilder) {
        brand = planeBuilder.brand;
        model = planeBuilder.model;
        capacity = planeBuilder.capacity;
        maxSpeed = planeBuilder.maxSpeed;
        rangeOfFlight = planeBuilder.rangeOfFlight;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public static class PlaneBuilder {
        private String brand;
        private String model;
        private int capacity;
        private int maxSpeed;
        private int rangeOfFlight;

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setRangeOfFlight(int rangeOfFlight) {
            this.rangeOfFlight = rangeOfFlight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
