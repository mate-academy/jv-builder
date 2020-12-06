package core.basesyntax;

public class Plane {
    private String model;
    private String company;
    private int year;
    private int capacity;
    private String colour;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.company = builder.company;
        this.year = builder.year;
        this.capacity = builder.capacity;
        this.colour = builder.colour;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", company='" + company + '\''
                + ", year=" + year
                + ", capacity=" + capacity
                + ", colour='" + colour + '\''
                + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String company;
        private int year;
        private int capacity;
        private String colour;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

}
