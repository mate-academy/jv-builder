package core.basesyntax;


/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private int capacity;
    private int flightRange;
    private int power;
    private int wingspan;


    public Plane(PlaneBuilder planeBuilder) {
    }

    public static class PlaneBuilder {
        private Plane newPlane;

        PlaneBuilder() {}

        public PlaneBuilder setName(String name) {
            newPlane.name = name;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            newPlane.capacity = capacity;
            return this;
        }

        public PlaneBuilder setFlightRange(int flightRange) {
            newPlane.flightRange = flightRange;
            return this;
        }

        public PlaneBuilder setPower(int power) {
            newPlane.power = power;
            return this;
        }

        public PlaneBuilder setWingspan(int wingspan) {
            newPlane.wingspan = wingspan;
            return this;
        }

        public Plane build() {
            return newPlane;
        }
    }
}
