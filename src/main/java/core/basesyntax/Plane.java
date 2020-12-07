package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private int year;
    private String company;
    private int seatPassengers;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
        this.company = builder.company;
        this.seatPassengers = builder.seatPassengers;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", year=" + year
                + ", company='" + company + '\''
                + ", seatPassengers=" + seatPassengers + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int year;
        private String company;
        private int seatPassengers;

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

        public PlaneBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public PlaneBuilder setSeatPassengers(int seatPassengers) {
            this.seatPassengers = seatPassengers;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

}
