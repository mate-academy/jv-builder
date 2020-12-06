package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private int year;
    private String countryMaker;
    private int maxSpeed;

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.color = planeBuilder.color;
        this.year = planeBuilder.year;
        this.countryMaker = planeBuilder.countryMaker;
        this.maxSpeed = planeBuilder.maxSpeed;
    }

    @Override
    public String toString() {
        return "Plane{" + "model='" + model + '\'' + ", color='"
                + color + '\'' + ", year=" + year + ", countryMaker='" + countryMaker
                + '\'' + ", maxSpeed=" + maxSpeed + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int year;
        private String countryMaker;
        private int maxSpeed;

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

        public PlaneBuilder setCountryMaker(String countryMaker) {
            this.countryMaker = countryMaker;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
