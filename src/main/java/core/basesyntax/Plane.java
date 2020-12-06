package core.basesyntax;

public class Plane {
    private String name;
    private String model;
    private int horsePower;
    private int seats;
    private int year;

    public Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.horsePower = builder.horsePower;
        this.seats = builder.seats;
        this.year = builder.year;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "name='" + name + '\''
                + ", model='" + model + '\''
                + ", power=" + horsePower
                + ", seats=" + seats
                + ", year=" + year
                + '}';
    }

    public static class PlaneBuilder {
        private String name;
        private String model;
        private int horsePower;
        private int seats;
        private int year;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setHorsePower(int power) {
            this.horsePower = power;
            return this;
        }

        public PlaneBuilder setSeats(int seats) {
            this.seats = seats;
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
