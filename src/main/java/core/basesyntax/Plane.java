package core.basesyntax;

public class Plane {
    private String model;
    private boolean decommissioned;
    private double length;
    private double height;
    private int year;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.decommissioned = builder.decommissioned;
        this.length = builder.length;
        this.height = builder.height;
        this.year = builder.year;
    }

    @Override
    public String toString() {
        return "Plane: "
                + "model = \"" + model + '\"'
                + "; year = " + year
                + "; length = " + length
                + "; height = " + height
                + "; it is " + (decommissioned ? "" : "not ") + "decommissioned";
    }

    public static class PlaneBuilder {
        private String model;
        private boolean decommissioned;
        private double length;
        private double height;
        private int year;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setDecommissioned(boolean decommissioned) {
            this.decommissioned = decommissioned;
            return this;
        }

        public PlaneBuilder setLength(double length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setHeight(double height) {
            this.height = height;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
