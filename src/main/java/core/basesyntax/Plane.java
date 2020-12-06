package core.basesyntax;

public class Plane {
    private String model;
    private int flyDistance;
    private int passengersCapacity;
    private boolean isIntercontinental;
    private boolean hasBusinessClass;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.flyDistance = builder.flyDistance;
        this.passengersCapacity = builder.passengersCapacity;
        this.isIntercontinental = builder.isIntercontinental;
        this.hasBusinessClass = builder.hasBusinessClass;
    }

    public static class PlaneBuilder {
        private String model;
        private int flyDistance;
        private int passengersCapacity;
        private boolean isIntercontinental;
        private boolean hasBusinessClass;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setFlyDistance(int flyDistance) {
            this.flyDistance = flyDistance;
            return this;
        }

        public PlaneBuilder setPassengersCapacity(int passengersCapacity) {
            this.passengersCapacity = passengersCapacity;
            return this;
        }

        public PlaneBuilder setIsIntercontinental(boolean isIntercontinental) {
            this.isIntercontinental = isIntercontinental;
            return this;
        }

        public PlaneBuilder setHasBusinessClass(boolean hasBusinessClass) {
            this.hasBusinessClass = hasBusinessClass;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", flyDistance=" + flyDistance
                + ", passengersCapacity=" + passengersCapacity
                + ", isIntercontinental=" + isIntercontinental
                + ", hasBusinessClass=" + hasBusinessClass + '}';
    }
}
