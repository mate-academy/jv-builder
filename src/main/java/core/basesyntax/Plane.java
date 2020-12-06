package core.basesyntax;

public class Plane {
    private String maker;
    private String model;
    private int enginePower;
    private int passegerCapacity;
    private int maxFlightHigh;

    private Plane(PlaneBuilder builder) {
        this.maker = builder.maker;
        this.model = builder.model;
        this.enginePower = builder.enginePower;
        this.passegerCapacity = builder.passegerCapacity;
        this.maxFlightHigh = builder.maxFlightHigh;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "maker='" + maker + '\''
                + ", model='" + model + '\''
                + ", enginePower=" + enginePower
                + ", passegerCapacity=" + passegerCapacity
                + ", maxFlightHigh=" + maxFlightHigh
                + '}';
    }

    public static class PlaneBuilder {
        private String maker;
        private String model;
        private int enginePower;
        private int passegerCapacity;
        private int maxFlightHigh;

        public PlaneBuilder setMaker(String maker) {
            this.maker = maker;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setEnginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public PlaneBuilder setPassegerCapacity(int passegerCapacity) {
            this.passegerCapacity = passegerCapacity;
            return this;
        }

        public PlaneBuilder setMaxFlightHigh(int maxFlightHigh) {
            this.maxFlightHigh = maxFlightHigh;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
