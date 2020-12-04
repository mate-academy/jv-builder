package core.basesyntax;

public class Plane {
    private String name;
    private int amountSeats;
    private int amountTurbine;
    private int liftingCapacity;
    private int cruisingSpeed;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.amountSeats = builder.amountSeats;
        this.amountTurbine = builder.amountTurbine;
        this.liftingCapacity = builder.liftingCapacity;
        this.cruisingSpeed = builder.cruisingSpeed;
    }

    @Override
    public String toString() {
        return "Plane{" + "name='"
                + name + '\'' + ", amountSeats="
                + amountSeats + ", amountTurbine="
                + amountTurbine + ", liftingCapacity="
                + liftingCapacity + ", cruisingSpeed="
                + cruisingSpeed + '}';
    }

    public static class PlaneBuilder {
        private String name;
        private int amountSeats;
        private int amountTurbine;
        private int liftingCapacity;
        private int cruisingSpeed;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setAmountSeats(int amountSeats) {
            this.amountSeats = amountSeats;
            return this;
        }

        public PlaneBuilder setAmountTurbine(int amountTurbine) {
            this.amountTurbine = amountTurbine;
            return this;
        }

        public PlaneBuilder setLiftingCapacity(int liftingCapacity) {
            this.liftingCapacity = liftingCapacity;
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
