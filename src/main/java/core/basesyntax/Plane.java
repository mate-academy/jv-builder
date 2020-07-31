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

    public Plane(PlaneBuilder builder) {

    }

    public static class PlaneBuilder {

        private String name;
        private int maxSpeed;
        private int maxHeight;
        private int numberOfPassengers;
        private String manufacturer;

        public PlaneBuilder(String name, int maxSpeed, int maxHeight,
                            int numberOfPassengers, String manufacturer) {
            this.name = name;
            this.maxSpeed = maxSpeed;
            this.maxHeight = maxHeight;
            this.numberOfPassengers = numberOfPassengers;
            this.manufacturer = manufacturer;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public void setMaxHeight(int maxHeight) {
            this.maxHeight = maxHeight;
        }

        public void setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
