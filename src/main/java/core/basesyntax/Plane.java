package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private String typePlane;
    private int numberOfEngines;
    private int year;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.typePlane = builder.typePlane;
        this.numberOfEngines = builder.numberOfEngines;
        this.year = builder.year;
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private String typePlane;
        private int numberOfEngines;
        private int year;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setTypePlane(String typePlane) {
            this.typePlane = typePlane;
            return this;
        }

        public PlaneBuilder setNumberOfEngines(int numberOfEngines) {
            this.numberOfEngines = numberOfEngines;
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
