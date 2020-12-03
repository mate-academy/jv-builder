package core.basesyntax;

public class Plane {
    private final String model;
    private final int maxTakeoffWeight;
    private final int maxFlightAltitude;
    private final int flightRange;
    private final int cruisingSpeed;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.maxTakeoffWeight = builder.maxTakeoffWeight;
        this.maxFlightAltitude = builder.maxFlightAltitude;
        this.flightRange = builder.flightRange;
        this.cruisingSpeed = builder.cruisingSpeed;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", maxTakeoffWeight=" + maxTakeoffWeight
                + ", maxFlightAltitude=" + maxFlightAltitude
                + ", flightRange=" + flightRange
                + ", cruisingSpeed=" + cruisingSpeed
                + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private int maxTakeoffWeight;
        private int maxFlightAltitude;
        private int flightRange;
        private int cruisingSpeed;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setMaxTakeoffWeight(int maxTakeoffWeight) {
            this.maxTakeoffWeight = maxTakeoffWeight;
            return this;
        }

        public PlaneBuilder setMaxFlightAltitude(int maxFlightAltitude) {
            this.maxFlightAltitude = maxFlightAltitude;
            return this;
        }

        public PlaneBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        public PlaneBuilder setCruisingSpeed(int cruisingSpeed) {
            this.cruisingSpeed = cruisingSpeed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
