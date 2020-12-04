package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private double maxSpeed;
    private boolean propeller;
    private boolean airframe;
    private boolean wings;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
        this.propeller = builder.propeller;
        this.airframe = builder.airframe;
        this.wings = builder.wings;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Builder{")
                    + "model='" + model + '\''
                    + ", color='" + color + '\''
                    + ", maxSpeed=" + maxSpeed
                    + ", propeller=" + propeller
                    + ", airframe=" + airframe
                    + ", wings=" + wings
                    + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private double maxSpeed;
        private boolean propeller;
        private boolean airframe;
        private boolean wings;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setPropeller(boolean propeller) {
            this.propeller = propeller;
            return this;
        }

        public PlaneBuilder setAirframe(boolean airframe) {
            this.airframe = airframe;
            return this;
        }

        public PlaneBuilder setWings(boolean wings) {
            this.wings = wings;
            return this;
        }

        public Plane build() {
            if (this.airframe == false
                                 || this.propeller == false
                                 || this.wings == false) {
                throw new RuntimeException("Can't create Plane without airframe/propeller/wings");
            }
            return new Plane(this);
        }

    }
}
