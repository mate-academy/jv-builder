package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int numberOfSeats;
    private int maxSpeed;
    private long maxTakeoffWeight;
    private long maxFlightAltitude;
    private String countryOfProduction;

    private Plane(PlaneBuilder planeBuilder) {
    }

    public static class PlaneBuilder {
        private Plane plane;

        private PlaneBuilder() {
            plane = new Plane(this);
        }

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            plane.numberOfSeats = numberOfSeats;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            plane.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setMaxTakeoffWeight(long maxTakeoffWeight) {
            plane.maxTakeoffWeight = maxTakeoffWeight;
            return this;
        }

        public PlaneBuilder setMaxFlightAltitude(long maxFlightAltitude) {
            plane.maxFlightAltitude = maxFlightAltitude;
            return this;
        }

        public PlaneBuilder setCountryOfProduction(String countryOfProduction) {
            plane.countryOfProduction = countryOfProduction;
            return this;
        }

        public Plane build() {
            return plane;
        }

    }
}
