package core.basesyntax;

public class Plane {
    private String model;
    private int speed;
    private int mass;
    private int seats;
    private String owner;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.speed = builder.speed;
        this.mass = builder.mass;
        this.seats = builder.seats;
        this.owner = builder.owner;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", speed=" + speed
                + ", mass=" + mass
                + ", seats=" + seats
                + ", owner='" + owner + '\''
                + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private int speed;
        private int mass;
        private int seats;
        private String owner;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setMass(int mass) {
            this.mass = mass;
            return this;
        }

        public PlaneBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public PlaneBuilder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
