package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String name;
    private int maxSpeed;
    private int maxHeight;
    private int numberOfPassengers;
    private String manufacturer;

    public Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.maxSpeed = planeBuilder.maxSpeed;
        this.maxHeight = planeBuilder.maxHeight;
        this.numberOfPassengers = planeBuilder.numberOfPassengers;
        this.manufacturer = planeBuilder.manufacturer;
    }

    public static class PlaneBuilder {

        private String name;
        private int maxSpeed;
        private int maxHeight;
        private int numberOfPassengers;
        private String manufacturer;

        public PlaneBuilder setName(String name) {
            this.name = name;
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

        public PlaneBuilder setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
            return this;
        }

        public PlaneBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
