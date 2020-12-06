package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private int year;
    private int rangeOfFlight;
    private int weight;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
        this.rangeOfFlight = builder.rangeOfFlight;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", year=" + year
                + ", rangeOfFlight=" + rangeOfFlight
                + ", weight=" + weight + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int year;
        private int rangeOfFlight;
        private int weight;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setRangeOfFlight(int rangeOfFlight) {
            this.rangeOfFlight = rangeOfFlight;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
