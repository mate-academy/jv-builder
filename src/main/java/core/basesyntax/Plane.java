package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private double maxSpeed;
    private boolean hasPropeller;
    private boolean hasAirframe;
    private boolean hasWings;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
        this.hasPropeller = builder.hasPropeller;
        this.hasAirframe = builder.hasAirframe;
        this.hasWings = builder.hasWings;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Builder{")
                    + "model='" + model + '\''
                    + ", color='" + color + '\''
                    + ", maxSpeed=" + maxSpeed
                    + ", hasAirframe=" + hasPropeller
                    + ", hasAirframe=" + hasAirframe
                    + ", hasWings=" + hasWings
                    + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private double maxSpeed;
        private boolean hasPropeller;
        private boolean hasAirframe;
        private boolean hasWings;

        public PlaneBuilder(boolean hasPropeller, boolean hasAirframe, boolean hasWings) {
            this.hasWings = hasWings;
            this.hasPropeller = hasPropeller;
            this.hasAirframe = hasAirframe;
        }

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

        public PlaneBuilder setHasPropeller(boolean hasPropeller) {
            this.hasPropeller = hasPropeller;
            return this;
        }

        public PlaneBuilder setHasAirframe(boolean hasAirframe) {
            this.hasAirframe = hasAirframe;
            return this;
        }

        public PlaneBuilder setHasWings(boolean hasWings) {
            this.hasWings = hasWings;
            return this;
        }

        public Plane build() {
            if (this.hasAirframe == false
                                 || this.hasPropeller == false
                                 || this.hasWings == false) {
                throw new RuntimeException("Can't create Plane without airframe/propeller/wings");
            }
            return new Plane(this);
        }

    }
}
