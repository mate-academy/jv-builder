package core.basesyntax;

public class Plane {
    private double mass;
    private double maxHeight;
    private double maxSpeed;
    private double maxMassTransported;
    private String model;

    private Plane(PlaneBuilder builder) {
        this.mass = builder.mass;
        this.maxHeight = builder.maxHeight;
        this.maxSpeed = builder.maxSpeed;
        this.maxMassTransported = builder.maxMassTransported;
        this.model = builder.model;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxMassTransported() {
        return maxMassTransported;
    }

    public String getModel() {
        return model;
    }

    public double getMass() {
        return mass;
    }

    public String toString() {
        return model + ". Max mass transported: "
                + String.format("%.2f", maxMassTransported) + " tons, max speed "
                + String.format("%.2f", maxSpeed) + "Km/h, max height "
                + String.format("%.2f", maxHeight) + "Km, weight "
                + String.format("%.2f", mass) + " tons";
    }

    public static class PlaneBuilder {
        private double mass;
        private double maxHeight;
        private double maxSpeed;
        private double maxMassTransported;
        private String model;

        public PlaneBuilder(String model) {
            this.model = model;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setMass(double mass) {
            this.mass = mass;
            return this;
        }

        public PlaneBuilder setMaxHeight(double maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public PlaneBuilder setMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setMaxMassTransported(double maxMassTransported) {
            this.maxMassTransported = maxMassTransported;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
