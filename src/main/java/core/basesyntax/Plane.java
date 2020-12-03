package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private int flightRange;
    private int maxSpeed;
    private int passengerCapacity;

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.color = planeBuilder.color;
        this.flightRange = planeBuilder.flightRange;
        this.maxSpeed = planeBuilder.maxSpeed;
        this.passengerCapacity = planeBuilder.passengerCapacity;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='"
                + model
                + '\''
                + ", color='"
                + color
                + '\''
                + ", flightRange="
                + flightRange
                + ", maxSpeed="
                + maxSpeed
                + ", passengerCapacity="
                + passengerCapacity
                + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int flightRange;
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

        public PlaneBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
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
