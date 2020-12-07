package core.basesyntax;

public class Plane {
    private String model;
    private int capacity;
    private String type;
    private int year;
    private int range;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.capacity = builder.capacity;
        this.type = builder.type;
        this.year = builder.year;
        this.range = builder.range;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", capacity='" + capacity + '\''
                + ", type='" + type + '\''
                + ", year=" + year
                + ", range=" + range
                + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private int capacity;
        private String type;
        private int year;
        private int range;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setRange(int range) {
            this.range = range;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

}
