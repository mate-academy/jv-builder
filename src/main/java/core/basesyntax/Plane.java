package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private double length;
    private double maximumSpeed;
    private String brand;
    private String model;
    private double height;
    private double emptyWeight;

    private Plane(PlaneBuilder planeBuilder) {
        this.length = planeBuilder.length;
        this.maximumSpeed = planeBuilder.maximumSpeed;
        this.brand = planeBuilder.brand;
        this.model = planeBuilder.model;
        this.height = planeBuilder.height;
        this.emptyWeight = planeBuilder.emptyWeight;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "length=" + length
                + ", maximumSpeed=" + maximumSpeed
                + ", brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", height=" + height
                + ", emptyWeight=" + emptyWeight
                + '}';
    }

    public static class PlaneBuilder {
        private double length;
        private double maximumSpeed;
        private String brand;
        private String model;
        private double height;
        private double emptyWeight;

        public PlaneBuilder setLength(double length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setMaximumSpeed(double maximumSpeed) {
            this.maximumSpeed = maximumSpeed;
            return this;
        }

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setHeight(double height) {
            this.height = height;
            return this;
        }

        public PlaneBuilder setEmptyWeight(double emptyWeight) {
            this.emptyWeight = emptyWeight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
