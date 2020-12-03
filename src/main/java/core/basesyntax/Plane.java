package core.basesyntax;

public class Plane {
    private String model;
    private String origin;
    private String type;
    private int year;
    private double maxHeight;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.origin = builder.origin;
        this.type = builder.type;
        this.year = builder.year;
        this.maxHeight = builder.maxHeight;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", origin='" + origin + '\''
                + ", type='" + type + '\''
                + ", year=" + year
                + ", maxHeight=" + maxHeight
                + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String origin;
        private String type;
        private int year;
        private double maxHeight;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setOrigin(String origin) {
            this.origin = origin;
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

        public PlaneBuilder setMaxHeight(double maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
