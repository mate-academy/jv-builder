package core.basesyntax;

public class Plane {
    private String airPlaneType;
    private String name;
    private String color;
    private int capacity;
    private int range;
    private int celling;
    private int year;

    private Plane(PlaneBuilder builder) {
        this.airPlaneType = builder.airPlaneType;
        this.name = builder.name;
        this.color = builder.color;
        this.capacity = builder.capacity;
        this.range = builder.range;
        this.celling = builder.celling;
    }

    public static class PlaneBuilder {
        private String airPlaneType;
        private String name;
        private String color;
        private int capacity;
        private int range;
        private int celling;
        private int year;

        public PlaneBuilder(String airPlaneType) {
            this.airPlaneType = airPlaneType;
        }

        public PlaneBuilder setCelling(int celling) {
            this.celling = celling;
            return this;
        }

        public PlaneBuilder setAirPlaneType(String airPlaneType) {
            this.airPlaneType = airPlaneType;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setRange(int range) {
            this.range = range;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return "Plane{"
                + "airPlaneType='" + airPlaneType + '\''
                + ", name='" + name + '\''
                + ", color='" + color + '\''
                + ", capacity=" + capacity
                + ", range=" + range
                + ", celling=" + celling
                + ", year=" + year
                + '}';
    }
}
