package core.basesyntax;

public class Plane {
    private String name;
    private String model;
    private String colour;
    private int year;
    private int passengerCapacity;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.model = planeBuilder.model;
        this.colour = planeBuilder.colour;
        this.year = planeBuilder.year;
        this.passengerCapacity = planeBuilder.passengerCapacity;
    }

    public static class PlaneBuilder {
        private String name;
        private String model;
        private String colour;
        private int year;
        private int passengerCapacity;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return "Plane { "
                + "name = " + name
                + ", model = " + model
                + ", colour = " + colour
                + ", year = " + year
                + ", passengerCapacity = "
                + passengerCapacity + " }";
    }
}
