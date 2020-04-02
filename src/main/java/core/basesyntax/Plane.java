package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private final int seatsCount;
    private final int maxFlightDistance;
    private final String manufacturer;
    private final String model;
    private final String airline;

    private Plane(PlaneBuilder pb) {
        this.seatsCount = pb.seatsCount;
        this.maxFlightDistance = pb.maxFlightDistance;
        this.manufacturer = pb.manufacturer;
        this.model = pb.model;
        this.airline = pb.airline;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getAirline() {
        return airline;
    }

    public static class PlaneBuilder {

        private int seatsCount;
        private int maxFlightDistance;
        private String manufacturer;
        private String model;
        private String airline;

        public PlaneBuilder setSeatsCount(int seatsCount) {
            this.seatsCount = seatsCount;
            return this;
        }

        public PlaneBuilder setMaxFlightDistance(int maxFlightDistance) {
            this.maxFlightDistance = maxFlightDistance;
            return this;
        }

        public PlaneBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setAirline(String airline) {
            this.airline = airline;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
