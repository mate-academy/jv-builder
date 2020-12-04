package core.basesyntax;

public class Plane {
    private String name;
    private String company;
    private int seats;
    private int year;
    private int length;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.company = builder.company;
        this.seats = builder.seats;
        this.year = builder.year;
        this.length = builder.length;
    }

    public String toString() {
        return "PLane: " + name + "\nMade by: " + company + "\nHas seats: " + seats
                + "\nYear made in: " + year + "\nLength: " + length;
    }

    public static class PlaneBuilder {
        private String name;
        private String company;
        private int seats;
        private int year;
        private int length;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setCompany(String company) {
            this.company = company;
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

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
