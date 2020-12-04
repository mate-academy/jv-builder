package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private int year;
    private int passengerCapacity;
    private int power;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
        this.passengerCapacity = builder.passengerCapacity;
        this.power = builder.power;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", year=" + year
                + ", passengerCapacity=" + passengerCapacity
                + ", power=" + power + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int year;
        private int passengerCapacity;
        private int power;

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

        public PlaneBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public PlaneBuilder setPower(int power) {
            this.power = power;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
