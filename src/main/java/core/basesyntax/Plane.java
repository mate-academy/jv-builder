package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String brand;
    private String model;
    private int maxSpeed;
    private int maxHeight;
    private double engineVolume;

    private Plane(PlaneBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.maxSpeed = builder.maxSpeed;
        this.maxHeight = builder.maxHeight;
        this.engineVolume = builder.engineVolume;;
    }

    public static class PlaneBuilder {
        private String brand;
        private String model;
        private int maxSpeed;
        private int maxHeight;
        private double engineVolume;

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setMaxHeight(int maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public PlaneBuilder setEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
