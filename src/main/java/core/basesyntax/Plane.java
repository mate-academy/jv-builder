package core.basesyntax;

public class Plane {
    private String name;
    private String type;
    private int maxSpeed;
    private int passengerCapacity;
    private int rangeOfFlight;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.maxSpeed = builder.maxSpeed;
        this.passengerCapacity = builder.passengerCapacity;
        this.rangeOfFlight = builder.rangeOfFlight;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public static class PlaneBuilder {
        private String name;
        private String type;
        private int maxSpeed;
        private int passengerCapacity;
        private int rangeOfFlight;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
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

        public PlaneBuilder setRangeOfFlight(int rangeOfFlight) {
            this.rangeOfFlight = rangeOfFlight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
