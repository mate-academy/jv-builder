package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private int year;
    private int passengersCapacity;
    private double engineThrust;

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.color = planeBuilder.color;
        this.year = planeBuilder.year;
        this.passengersCapacity = planeBuilder.passengersCapacity;
        this.engineThrust = planeBuilder.engineThrust;
    }

    @Override
    public String toString() {
        return "Plane : "
                + "model = '" + model + '\'' + ", color = '" + color + '\''
                + ", year = " + year + ", passengers capacity = " + passengersCapacity
                + ", engine thrust = " + engineThrust;
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int year;
        private int passengersCapacity;
        private double engineThrust;

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

        public PlaneBuilder setPassengersCapacity(int passengersCapacity) {
            this.passengersCapacity = passengersCapacity;
            return this;
        }

        public PlaneBuilder setEngineThrust(double engineThrust) {
            this.engineThrust = engineThrust;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
