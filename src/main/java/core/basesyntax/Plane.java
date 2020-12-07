package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private int length;
    private int year;
    private String mission;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.length = builder.length;
        this.year = builder.year;
        this.mission = builder.mission;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", length=" + length
                + ", year=" + year
                + ", mission='" + mission + '\'' + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int length;
        private int year;
        private String mission;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setMission(String mission) {
            this.mission = mission;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
