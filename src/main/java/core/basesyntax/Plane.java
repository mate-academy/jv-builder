package core.basesyntax;

public class Plane {
    private String name;
    private String propulsion;
    private double length;
    private double lengthWings;
    private boolean work;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.propulsion = planeBuilder.propulsion;
        this.length = planeBuilder.length;
        this.lengthWings = planeBuilder.lengthWings;
        this.work = planeBuilder.isWork;
    }

    public String getName() {
        return name;
    }

    public String getPropulsion() {
        return propulsion;
    }

    public double getLength() {
        return length;
    }

    public double getLengthWings() {
        return lengthWings;
    }

    public boolean isWork() {
        return work;
    }

    @Override
    public String toString() {
        return "Plane " + getName() + ", type of engine: "
                + getPropulsion() + ", from nose to tail: "
                + getLength() + " wingspan:"
                + getLengthWings() + " and the lane "
                + (isWork() ? "can" : "can't")
                + " fly";
    }

    public static class PlaneBuilder {
        private String name;
        private String propulsion;
        private double length;
        private double lengthWings;
        private boolean isWork;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setPropulsion(String propulsion) {
            this.propulsion = propulsion;
            return this;
        }

        public PlaneBuilder setLength(double length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setLengthWings(double lengthWings) {
            this.lengthWings = lengthWings;
            return this;
        }

        public PlaneBuilder setWork(boolean work) {
            isWork = work;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
